package com.prueba.tecnica.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "transport")
@Data
public class Transport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JoinColumn(name = "id_flight",referencedColumnName = "id",insertable = true, updatable = true)
	@OneToOne
	private Flight flight;
	
	@Column(name="flightCarrier",length = 3,nullable = false)
	private String flightCarrier;
	
	@Column(name="flightNumber",length = 3,nullable = false)
	private String flightNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public String getFlightCarrier() {
		return flightCarrier;
	}

	public void setFlightCarrier(String flightCarrier) {
		this.flightCarrier = flightCarrier;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	
	

}
