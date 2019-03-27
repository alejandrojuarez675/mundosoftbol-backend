package com.mundosoftbol.site.controller;

import org.springframework.beans.factory.annotation.Autowired;
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
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String pato() {
		StringBuilder stringBuilder = new StringBuilder();
		patoPruebaRepository.findAll().forEach(str ->{
			stringBuilder.append(str.getId());
		});
		System.out.println(stringBuilder.toString());
		return stringBuilder.toString();
	}
	
	
}
