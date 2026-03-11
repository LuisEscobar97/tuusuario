package com.tuusuario.demo_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tuusuario.demo_api.model.Product;
import com.tuusuario.demo_api.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	 private  ProductRepository repository;


	    public List<Product> getAll() {
	        return repository.findAll();
	    }

	    public void create(Product product) {
	        repository.save(product);
	    }
	    
	    public Product getProductByID(Long id) {
	    	return repository.findById(id).orElseThrow();
	    }
	    
	    public Product updateProduct(Long id,Product product) {
	    	Product existing= repository.findById(id).orElseThrow();
	    	existing.setName(product.getName());
	    	existing.setProce(product.getProce());
	    	return repository.save(existing);
	    }
	    
	    public void deleteProduct(Long id) {
	    	repository.deleteById(id);
	    }
	    
	    

}
