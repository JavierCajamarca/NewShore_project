package com.prueba.tecnica.service.impl;

import org.springframework.stereotype.Service;

import com.prueba.tecnica.domain.Flight;
import com.prueba.tecnica.repository.FlightRepository;
import com.prueba.tecnica.service.FlightService;

@Service
public class FlightServicesImpl implements FlightService{
	
private final FlightRepository flightReposiroty ;
	
	public FlightServicesImpl (  FlightRepository pflightReposiroty) {
		
		this.flightReposiroty = pflightReposiroty;
	}
	
	@Override
	public Flight save(Flight pFlight) {
		
		return this.flightReposiroty.save( pFlight );
		
	}
	
	@Override
	public void  delete(int pfightID) {
		
		 this.flightReposiroty.deleteById( pfightID );
		
	}
}

