package com.mundosoftbol.site.service;

import com.mundosoftbol.site.dto.ImagenDTO;
import com.mundosoftbol.site.entity.Imagen;

public interface ImagenService {
	ImagenDTO entityToDto(Imagen entity);
	Imagen dtoToEntity(ImagenDTO dto);
	Imagen save(Imagen imagen);
	Imagen findById(long id);
}
