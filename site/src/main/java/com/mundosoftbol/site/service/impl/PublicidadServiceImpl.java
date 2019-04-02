package com.mundosoftbol.site.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mundosoftbol.site.dto.PublicidadDTO;
import com.mundosoftbol.site.entity.Imagen;
import com.mundosoftbol.site.entity.Publicidad;
import com.mundosoftbol.site.repository.PublicidadRepository;
import com.mundosoftbol.site.service.ImagenService;
import com.mundosoftbol.site.service.PublicidadService;

@Service
public class PublicidadServiceImpl implements PublicidadService{

	@Autowired
	private PublicidadRepository publicidadRepository;
	
	@Autowired
	private ImagenService imagenService;
	
	
	@Override
	public Publicidad save(Publicidad Publicidad) {
		return publicidadRepository.save(Publicidad);
	}

	@Override
	public PublicidadDTO save(PublicidadDTO PublicidadDTO) {
		return entityToDto(save(dtoToEntity(PublicidadDTO)));
	}

	@Override
	public void delete(Publicidad Publicidad) {
		publicidadRepository.delete(Publicidad);
	}

	@Override
	public void delete(PublicidadDTO PublicidadDTO) {
		publicidadRepository.deleteById(PublicidadDTO.getId());
	}

	private PublicidadDTO entityToDto(Publicidad entity) {
		PublicidadDTO dto = new PublicidadDTO();
		
		ModelMapper mapper = new ModelMapper();
		mapper.map(entity, dto);
		
		dto.setImagen(imagenService.entityToDto(entity.getImagen()));
		
		return dto;
	}
	
	private Publicidad dtoToEntity(PublicidadDTO dto) {
		Publicidad publicidad = new Publicidad();
		
		ModelMapper mapper = new ModelMapper();
		mapper.map(dto, publicidad);
		
		Imagen imagen = imagenService.findById(dto.getImagen().getId());
		if (imagen == null) {
			mapper.map(dto.getImagen(),imagen);
		}
		publicidad.setImagen(imagen);
		
		return publicidad;
	}

	@Override
	public List<PublicidadDTO> search() {
		List<PublicidadDTO> list = new ArrayList<>();
		publicidadRepository.findOrderByOrden().forEach(entity -> {
			list.add(entityToDto(entity));
			});
		return list;
	}
	
}
