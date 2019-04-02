package com.mundosoftbol.site.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mundosoftbol.site.dto.ArticuloDTO;
import com.mundosoftbol.site.dto.PaginaDTO;
import com.mundosoftbol.site.dto.PublicidadDTO;
import com.mundosoftbol.site.service.ArticuloService;
import com.mundosoftbol.site.service.PublicidadService;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class SitioController {

	@Autowired
	private ArticuloService articuloService;
	
	@Autowired
	private PublicidadService publicidadService;
	
	
	@ResponseBody
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public ResponseEntity<PaginaDTO> pagina() {
		
		PaginaDTO pagina = new PaginaDTO();
		
		List<ArticuloDTO> articuloDTOs = new ArrayList<>();
		List<PublicidadDTO> publicidadDTOs = new ArrayList<>();
		
		articuloDTOs = articuloService.searchTop10();
		publicidadDTOs = publicidadService.search();
		
		pagina.setArticuloDTOs(articuloDTOs);
		pagina.setPublicidadDTOs(publicidadDTOs);
		
		return new ResponseEntity<PaginaDTO>(pagina, HttpStatus.OK);
	}
	
}
