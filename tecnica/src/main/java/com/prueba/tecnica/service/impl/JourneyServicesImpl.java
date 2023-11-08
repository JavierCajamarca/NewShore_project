package com.prueba.tecnica.service.impl;

import org.springframework.stereotype.Service;

import com.prueba.tecnica.domain.Journey;
import com.prueba.tecnica.repository.JourneyRepository;
import com.prueba.tecnica.service.JourneyService;

@Service
public class JourneyServicesImpl implements JourneyService{
	
	
	private final JourneyRepository journeyReposiroty ;
	
	
	public JourneyServicesImpl (JourneyRepository pjourneyReposiroty) {
		
		this.journeyReposiroty = pjourneyReposiroty;
	}
	
	@Override
	public Journey save(Journey pJourney) {
		
		return this.journeyReposiroty.save( pJourney );
		
	}
	
	@Override
	public void  delete(int pJourneyId) {
		
		 this.journeyReposiroty.deleteById( pJourneyId );
		
	}

}
