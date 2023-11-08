package com.prueba.tecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import com.prueba.tecnica.domain.Journey;

@Repository
public interface JourneyRepository extends JpaRepository<Journey, Integer>, JpaSpecificationExecutor<Journey>{
	
}
