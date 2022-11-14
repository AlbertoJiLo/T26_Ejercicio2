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

import com.example.T26.dto.Asignado_A;
import com.example.T26.service.Asignado_AServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorAsignado_A {
	
	@Autowired
	Asignado_AServiceImpl asignados_aServiceImpl;
	
	@GetMapping("/asignados_a")
	public List<Asignado_A> listarAsignados_A(){
		return asignados_aServiceImpl.listarAsignados_A();
	}
	
	@PostMapping("/asignados_a")
	public Asignado_A crearAsignado_A(@RequestBody Asignado_A asignado_a) {
		
		return asignados_aServiceImpl.crearAsignado_A(asignado_a);
		
	}
	
	
	@GetMapping("/asignados_a/{id}")
	public Asignado_A leerAsignado_A(@PathVariable(name="id") Long id) {
		
		Asignado_A asignado_a= new Asignado_A();
		
		asignado_a=asignados_aServiceImpl.leerAsignado_A(id);
		
		System.out.println("Asignado_A segun ID: "+asignado_a);
		
		return asignado_a;
	}
	
	@PutMapping("/asignados_a/{id}")
	public Asignado_A actualizarAsignado_A(@PathVariable(name="id")Long id,@RequestBody Asignado_A asignado_a) {
		
		Asignado_A asignado_a_seleccionado= new Asignado_A();
		Asignado_A asignado_a_actualizado= new Asignado_A();
		
		asignado_a_seleccionado= asignados_aServiceImpl.leerAsignado_A(id);

		asignado_a_seleccionado.setCientificos(asignado_a.getCientificos());
		asignado_a_seleccionado.setProyectos(asignado_a.getProyectos());

		
		asignado_a_actualizado = asignados_aServiceImpl.actualizarAsignado_A(asignado_a_seleccionado);
		
		System.out.println("El asignado_a actualizado es: "+ asignado_a_actualizado);
		
		return asignado_a_actualizado;
	}
	
	@DeleteMapping("/asignados_a/{id}")
	public void borrarAsignado_A(@PathVariable(name="id")Long id) {
		asignados_aServiceImpl.borrarAsignado_A(id);
	}
	
	
}
