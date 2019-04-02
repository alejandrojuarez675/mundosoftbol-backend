package com.mundosoftbol.site.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mundosoftbol.site.dto.ArticuloDTO;
import com.mundosoftbol.site.dto.ImagenDTO;
import com.mundosoftbol.site.entity.Articulo;
import com.mundosoftbol.site.entity.ArticuloImagen;
import com.mundosoftbol.site.entity.Imagen;
import com.mundosoftbol.site.repository.ArticuloImagenRepository;
import com.mundosoftbol.site.repository.ArticuloRepository;
import com.mundosoftbol.site.service.ArticuloService;
import com.mundosoftbol.site.service.ImagenService;

@Service
public class ArticuloServiceImpl implements ArticuloService{

	@Autowired
	private ArticuloRepository articuloRepository;
	
	@Autowired
	private ArticuloImagenRepository articuloImagenRepository;
	
	@Autowired
	private ImagenService imagenService;
	
	@Override
	public Articulo save(Articulo articulo) {
		return articuloRepository.save(articulo);
	}

	@Override
	public void delete(Articulo articulo) {
		articuloRepository.delete(articulo);
	}

	@Override
	public ArticuloDTO save(ArticuloDTO articuloDTO) {
		
		Articulo articulo = dtoToEntity(articuloDTO);
		articulo = articuloRepository.save(articulo);
		
		final Articulo articuloAux = articulo;
		
		articuloDTO.getImagenes().forEach(imagenesDTO->{
			Imagen imagen = imagenService.dtoToEntity(imagenesDTO);
			imagen = imagenService.save(imagen);
			
			ArticuloImagen articuloImagen = new ArticuloImagen();
			articuloImagen.setArticulo(articuloAux);
			articuloImagen.setImagen(imagen);
			
			articuloImagenRepository.save(articuloImagen);
		});
		
		return articuloDTO;
	}

	private Articulo dtoToEntity(ArticuloDTO articuloDTO) {
		Articulo articulo = new Articulo();
		
		ModelMapper mapper = new ModelMapper();
		mapper.map(articuloDTO, articulo);
		
		return articulo;
	}

	@Override
	public void delete(ArticuloDTO articuloDTO) {
		Articulo articulo = articuloRepository.findById(articuloDTO.getId()).get();
		
		if (articulo != null) {
			
			articulo.getArticuloImagenes().forEach(articuloImagen -> {
				articuloImagenRepository.delete(articuloImagen);
			});
			
			articuloRepository.delete(articulo);
		}
	}

	@Override
	public List<ArticuloDTO> searchTop10() {
		List<ArticuloDTO> list = new ArrayList<>();
		articuloRepository.findTop10().forEach(entity -> list.add(entityToDto(entity)) );
		return list;
	}

	private ArticuloDTO entityToDto(Articulo entity) {
		ArticuloDTO articuloDTO = new ArticuloDTO();
		
		ModelMapper mapper = new ModelMapper();
		mapper.map(entity, articuloDTO);
		
		List<ImagenDTO> list = new ArrayList<>();
		entity.getArticuloImagenes().forEach(articuloImagen->{
			list.add(imagenService.entityToDto(articuloImagen.getImagen()));
		});
		articuloDTO.setImagenes(list);
		
		return articuloDTO;
	}

}
