package com.tuusuario.demo_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tuusuario.demo_api.model.Product;
import com.tuusuario.demo_api.service.ProductService;

@RestController
@RequestMapping("/products")
public class HelloController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping("")
	public List<Product> getAll(){
		
		return service.getAll();
	}
	
	@PostMapping("")
	public void create(@RequestBody Product porduct) {
		service.create(porduct);
		
	}
}
