package com.example.T26.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T26.dto.Cientificos;


public interface ICientificosDAO extends JpaRepository<Cientificos, String>{
	
}
