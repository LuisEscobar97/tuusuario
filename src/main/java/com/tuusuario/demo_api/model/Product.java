package com.tuusuario.demo_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double proce;
	public Product(Long id, String name, double proce) {
		super();
		this.id = id;
		this.name = name;
		this.proce = proce;
	}
	public Product() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getProce() {
		return proce;
	}
	public void setProce(double proce) {
		this.proce = proce;
	}
	
	
	

}
