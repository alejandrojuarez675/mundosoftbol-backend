package com.mundosoftbol.site.service;

import com.mundosoftbol.site.dto.ArticuloDTO;
import com.mundosoftbol.site.entity.Articulo;

public interface ArticuloService {
	Articulo save(Articulo articulo);
	ArticuloDTO save(ArticuloDTO articuloDTO);
	void delete(Articulo articulo);
	void delete(ArticuloDTO articuloDTO);
}
