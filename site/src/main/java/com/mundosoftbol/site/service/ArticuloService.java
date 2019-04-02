package com.mundosoftbol.site.service;

import java.util.List;

import com.mundosoftbol.site.dto.ArticuloDTO;
import com.mundosoftbol.site.entity.Articulo;

public interface ArticuloService {
	Articulo save(Articulo articulo);
	ArticuloDTO save(ArticuloDTO articuloDTO);
	void delete(Articulo articulo);
	void delete(ArticuloDTO articuloDTO);
	List<ArticuloDTO> searchTop10();
}
