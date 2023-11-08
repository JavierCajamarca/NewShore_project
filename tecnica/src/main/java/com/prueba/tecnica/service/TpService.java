package com.prueba.tecnica.service;

import com.prueba.tecnica.domain.Transport;

public interface TpService {

	Transport save(Transport pTransport);

	void delete(int pTransportID);

}
