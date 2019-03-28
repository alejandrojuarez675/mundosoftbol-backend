package com.mundosoftbol.site.service;

import com.mundosoftbol.site.dto.ImagenDTO;
import com.mundosoftbol.site.entity.Imagen;

public interface ImagenService {
	Imagen dtoToEntity(ImagenDTO dto);
	Imagen save(Imagen imagen);
}
