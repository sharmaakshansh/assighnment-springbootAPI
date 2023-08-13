package com.springboot.springrest.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.springrest.entities.Load;

public interface LoadDao extends JpaRepository<Load,Long>{
	

}
