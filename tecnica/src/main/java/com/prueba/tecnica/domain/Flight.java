package com.prueba.tecnica.domain;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "flight")
@Data
public class Flight implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@JoinColumn(name = "id_journey",referencedColumnName = "id",insertable = true, updatable = true)
	@JsonBackReference
	@ManyToOne
	private Journey journey;
	
	@Column(name="origin",length = 3,nullable = false)
	private String origin;
	
	@Column(name="destination",length = 3,nullable = false)
	private String destination;
	
	@Column(name="price",nullable = false)
	private double price;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_transport", referencedColumnName = "id")
	private Transport transport;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Journey getJourney() {
		return journey;
	}

	public void setJourney(Journey journey) {
		this.journey = journey;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	

}
