package com.mundosoftbol.site.service;

import java.util.List;

import com.mundosoftbol.site.dto.PublicidadDTO;
import com.mundosoftbol.site.entity.Publicidad;

public interface PublicidadService {
	Publicidad save(Publicidad Publicidad);
	PublicidadDTO save(PublicidadDTO PublicidadDTO);
	void delete(Publicidad Publicidad);
	void delete(PublicidadDTO PublicidadDTO);
	List<PublicidadDTO> search();
}
