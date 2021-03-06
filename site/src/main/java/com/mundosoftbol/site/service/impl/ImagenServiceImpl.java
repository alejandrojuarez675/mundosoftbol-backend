package com.mundosoftbol.site.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mundosoftbol.site.dto.ImagenDTO;
import com.mundosoftbol.site.entity.Imagen;
import com.mundosoftbol.site.repository.ImagenRepository;
import com.mundosoftbol.site.service.ImagenService;

@Service
public class ImagenServiceImpl implements ImagenService{

	@Autowired
	private ImagenRepository imagenRepository;
	
	@Override
	public Imagen dtoToEntity(ImagenDTO dto) {
		Imagen imagen = new Imagen();
		
		imagen.setId(dto.getId());
		imagen.setNombre(dto.getNombre());
		imagen.setUrl(dto.getUrl());
		
		return imagen;
	}

	@Override
	public Imagen save(Imagen imagen) {
		return imagenRepository.save(imagen);
	}

	@Override
	public ImagenDTO entityToDto(Imagen entity) {
		ImagenDTO dto = new ImagenDTO();
		
		ModelMapper mapper = new ModelMapper();
		mapper.map(entity, dto);
		
		return dto;
	}

	@Override
	public Imagen findById(long id) {
		return imagenRepository.findById(id).get();
	}

}
