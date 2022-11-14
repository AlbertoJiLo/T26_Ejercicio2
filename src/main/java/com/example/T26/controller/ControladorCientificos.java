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

import com.example.T26.dto.Cientificos;
import com.example.T26.service.CientificosServiceImpl;

@RestController
@RequestMapping("/api")
public class ControladorCientificos {
	
	@Autowired
	CientificosServiceImpl cientificosServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos(){
		return cientificosServiceImpl.listarCientificos();
	}
	
	@PostMapping("/cientificos")
	public Cientificos crearCientifico(@RequestBody Cientificos cientifico) {
		
		return cientificosServiceImpl.crearCientifico(cientifico);
		
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientificos leerCientifico(@PathVariable(name="dni") String dni) {
		
		Cientificos cientifico= new Cientificos();
		
		cientifico=cientificosServiceImpl.leerCientifico(dni);
		
		System.out.println("Cientifico segun ID: "+cientifico);
		
		return cientifico;
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientificos actualizarCientifico(@PathVariable(name="dni")String dni,@RequestBody Cientificos cientifico) {
		
		Cientificos cientifico_seleccionado= new Cientificos();
		Cientificos cientifico_actualizado= new Cientificos();
		
		cientifico_seleccionado= cientificosServiceImpl.leerCientifico(dni);

		cientifico_seleccionado.setNomapels(cientifico.getNomapels());
		
		cientifico_actualizado = cientificosServiceImpl.actualizarCientifico(cientifico_seleccionado);
		
		System.out.println("La cientifico actualizada es: "+ cientifico_actualizado);
		
		return cientifico_actualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void borrarCientifico(@PathVariable(name="dni")String dni) {
		cientificosServiceImpl.borrarCientifico(dni);
	}
	
	
}
