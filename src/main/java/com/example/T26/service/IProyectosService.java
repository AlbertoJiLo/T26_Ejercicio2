package com.example.T26.service;

import java.util.List;

import com.example.T26.dto.Proyectos;

public interface IProyectosService {

	//Metodos del CRUD
	
	public List<Proyectos> listarProyectos(); //Listar All 
	
	public Proyectos crearProyecto(Proyectos proyectos);	//CREATE
	
	public Proyectos leerProyecto(String id); // READ
		
	public Proyectos actualizarProyecto(Proyectos proyecto); // UPDATE
	
	public void borrarProyecto(String id);// DELETE
	
	
}