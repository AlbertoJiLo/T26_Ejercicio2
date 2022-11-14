package com.example.T26.service;

import java.util.List;

import com.example.T26.dto.Cientificos;

public interface ICientificosService {

	//Metodos del CRUD
	
	public List<Cientificos> listarCientificos(); //Listar All 
	
	public Cientificos crearCientifico(Cientificos cientificos);	//CREATE
	
	public Cientificos leerCientifico(String dni); // READ
		
	public Cientificos actualizarCientifico(Cientificos cientifico); // UPDATE
	
	public void borrarCientifico(String dni);// DELETE
	
	
}