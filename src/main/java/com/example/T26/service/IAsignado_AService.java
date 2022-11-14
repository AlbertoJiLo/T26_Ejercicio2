package com.example.T26.service;

import java.util.List;

import com.example.T26.dto.Cientificos;
import com.example.T26.dto.Asignado_A;

public interface IAsignado_AService {

	//Metodos del CRUD
	
	public List<Asignado_A> listarAsignados_A(); //Listar All 
	
	public Asignado_A crearAsignado_A(Asignado_A asignados_a);	//CREATE
			
	public Asignado_A actualizarAsignado_A(Asignado_A asignado_a); // UPDATE
	
	public void borrarAsignado_A(Long id);// DELETE

	public Asignado_A leerAsignado_A(Long id); // READ
		
}
