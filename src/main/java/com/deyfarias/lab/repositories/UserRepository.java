package com.deyfarias.lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.deyfarias.lab.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
