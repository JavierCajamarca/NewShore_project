package com.prueba.tecnica.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.tecnica.service.FlightService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/flight")
public class FlightController {

	private FlightService flightService;

	public FlightController(FlightService pFlightService) {
		this.flightService = pFlightService;
	}

}
