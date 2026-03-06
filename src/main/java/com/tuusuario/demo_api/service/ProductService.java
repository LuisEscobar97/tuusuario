package com.tuusuario.demo_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tuusuario.demo_api.model.Product;
import com.tuusuario.demo_api.repository.ProductRepository;

@Service
public class ProductService {
	 private final ProductRepository repository;

	    public ProductService(ProductRepository repository) {
	        this.repository = repository;
	    }

	    public List<Product> getAll() {
	        return repository.findAll();
	    }

	    public void create(Product product) {
	        repository.save(product);
	    }

}
