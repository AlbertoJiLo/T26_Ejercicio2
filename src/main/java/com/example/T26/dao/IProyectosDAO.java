package com.example.T26.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.T26.dto.Proyectos;


public interface IProyectosDAO extends JpaRepository<Proyectos, String>{
	
}
