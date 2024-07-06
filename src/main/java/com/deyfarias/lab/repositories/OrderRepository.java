package com.deyfarias.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deyfarias.lab.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
