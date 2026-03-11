package com.tuusuario.demo_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable Long id) {
		return service.getProductByID(id);
	}
	
	@PutMapping("/{id}")
	public Product updateProdcut(@PathVariable Long id, @RequestBody Product product) {
		return service.updateProduct(id, product);
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id) {
		service.deleteProduct(id);
	}
}
