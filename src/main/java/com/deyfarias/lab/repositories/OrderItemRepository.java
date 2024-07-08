package com.deyfarias.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deyfarias.lab.entities.OrderItem;
import com.deyfarias.lab.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{
	
}
