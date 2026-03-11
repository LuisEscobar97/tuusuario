package com.tuusuario.demo_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuusuario.demo_api.model.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
	
		
}
