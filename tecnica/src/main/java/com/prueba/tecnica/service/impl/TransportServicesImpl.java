package com.prueba.tecnica.service.impl;

import org.springframework.stereotype.Service;

import com.prueba.tecnica.domain.Transport;
import com.prueba.tecnica.repository.TransportRepository;
import com.prueba.tecnica.service.TpService;

@Service
public class TransportServicesImpl implements TpService{
	
private final TransportRepository transportReposiroty ;
	
	public TransportServicesImpl (TransportRepository ptransportReposiroty) {
		
		this.transportReposiroty = ptransportReposiroty;
	}
	
	@Override
	public Transport save(Transport pTransport) {
		
		return this.transportReposiroty.save( pTransport);
		
	}
	
	@Override
	public void  delete(int pTransportID) {
		
		 this.transportReposiroty.deleteById( pTransportID);
		
	}
	
}
