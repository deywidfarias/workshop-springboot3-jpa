package com.deyfarias.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deyfarias.lab.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
