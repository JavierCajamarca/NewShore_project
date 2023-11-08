package com.prueba.tecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.domain.Transport;
@Repository
public interface TransportRepository  extends JpaRepository<Transport, Integer>, JpaSpecificationExecutor<Transport>{

}
