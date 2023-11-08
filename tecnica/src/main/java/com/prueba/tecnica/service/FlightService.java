package com.prueba.tecnica.service;

import com.prueba.tecnica.domain.Flight;

public interface FlightService {

	Flight save(Flight pFlight);

	void delete(int pfightID);
	
}
