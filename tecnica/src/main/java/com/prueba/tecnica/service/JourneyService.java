package com.prueba.tecnica.service;

import com.prueba.tecnica.domain.Journey;

public interface JourneyService {

	Journey save(Journey pJourney);

	void delete(int pJourneyId);

	
}
