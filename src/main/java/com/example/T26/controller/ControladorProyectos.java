package com.example.T26.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.T26.dto.Proyectos;
import com.example.T26.service.ProyectosServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorProyectos {
	
	@Autowired
	ProyectosServiceImpl proyectosServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyectos> listarProyectos(){
		return proyectosServiceImpl.listarProyectos();
	}
	
	@PostMapping("/proyectos")
	public Proyectos crearProyecto(@RequestBody Proyectos proyecto) {
		
		return proyectosServiceImpl.crearProyecto(proyecto);
		
	}
	
	
	@GetMapping("/proyectos/{id}")
	public Proyectos leerProyecto(@PathVariable(name="id") String id) {
		
		Proyectos proyecto= new Proyectos();
		
		proyecto=proyectosServiceImpl.leerProyecto(id);
		
		System.out.println("Proyecto segun ID: "+proyecto);
		
		return proyecto;
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyectos actualizarProyecto(@PathVariable(name="id")String id,@RequestBody Proyectos proyecto) {
		
		Proyectos proyecto_seleccionado= new Proyectos();
		Proyectos proyecto_actualizado= new Proyectos();
		
		proyecto_seleccionado= proyectosServiceImpl.leerProyecto(id);

		proyecto_seleccionado.setNombre(proyecto.getNombre());
		proyecto_seleccionado.setHoras(proyecto.getHoras());
		
		proyecto_actualizado = proyectosServiceImpl.actualizarProyecto(proyecto_seleccionado);
		
		System.out.println("La proyecto actualizada es: "+ proyecto_actualizado);
		
		return proyecto_actualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void borrarProyecto(@PathVariable(name="id") String id) {
		proyectosServiceImpl.borrarProyecto(id);
	}
	
	
}
