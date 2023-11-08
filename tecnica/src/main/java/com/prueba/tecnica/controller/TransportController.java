package com.prueba.tecnica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.service.TpService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/transport")
public class TransportController {
		
	private final TpService transporService;
	
	@Autowired
	public TransportController(TpService pTService) {
		this.transporService = pTService;
	}
}
