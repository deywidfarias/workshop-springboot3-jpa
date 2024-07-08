package com.deyfarias.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deyfarias.lab.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
