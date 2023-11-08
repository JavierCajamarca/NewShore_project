package com.prueba.tecnica.controller;

import java.net.URI;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.prueba.tecnica.domain.Journey;
import com.prueba.tecnica.service.JourneyService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "/api/journey")
public class JourneyController {

	private JourneyService journeyServices;

	public JourneyController(JourneyService pJourneyService) {
		this.journeyServices = pJourneyService;
	}
	
	@PostMapping()
	public ResponseEntity<Journey> create(@RequestBody Journey journey){
		
		try {
			Journey myJourney = this.journeyServices.save(journey);
			
			//Journey myJourney = journey;
			//return ResponseEntity.ok("VAMOS BIEN");
			
			return ResponseEntity.created(new URI("/api/journey")).body(myJourney);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	} 
	
	@DeleteMapping("/{idJourney}")
	public ResponseEntity<String> deleteById(@PathVariable int idJourney){
		try {
			 this.journeyServices.delete(idJourney);
			
			return ResponseEntity.ok("El vuelo fue Eliminado");
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	
}
