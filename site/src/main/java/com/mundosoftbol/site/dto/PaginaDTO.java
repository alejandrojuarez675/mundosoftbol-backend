package com.mundosoftbol.site.dto;

import java.util.List;

public class PaginaDTO {
	
	List<ArticuloDTO> articuloDTOs;
	
	List<PublicidadDTO> publicidadDTOs;

	
	
	public List<ArticuloDTO> getArticuloDTOs() {
		return articuloDTOs;
	}

	public void setArticuloDTOs(List<ArticuloDTO> articuloDTOs) {
		this.articuloDTOs = articuloDTOs;
	}

	public List<PublicidadDTO> getPublicidadDTOs() {
		return publicidadDTOs;
	}

	public void setPublicidadDTOs(List<PublicidadDTO> publicidadDTOs) {
		this.publicidadDTOs = publicidadDTOs;
	}

}
