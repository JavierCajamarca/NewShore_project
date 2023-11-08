package com.prueba.tecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.domain.Flight;

@Repository
public interface FlightRepository  extends JpaRepository<Flight, Integer>, JpaSpecificationExecutor<Flight>{

}
