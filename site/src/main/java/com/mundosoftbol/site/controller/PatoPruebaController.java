package com.mundosoftbol.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mundosoftbol.site.repository.PatoPruebaRepository;

@RestController
public class PatoPruebaController {

	@Autowired
	private PatoPruebaRepository patoPruebaRepository;
	
	@ResponseBody
	@RequestMapping(value = "/patoprueba", method = RequestMethod.GET)
	public ResponseEntity<String> pato() {
		StringBuilder stringBuilder = new StringBuilder();
		patoPruebaRepository.findAll().forEach(str ->{
			stringBuilder.append(str.getId());
		});
		return new ResponseEntity<String>(new String(stringBuilder.toString()), HttpStatus.OK);
	}
	
	
}
