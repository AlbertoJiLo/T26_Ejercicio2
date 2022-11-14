package com.example.T26.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="proyecto")

public class Proyectos {

	//Atributos de la entidad Empleado
	@Id
	private String id;
	private String nombre;
	private int horas;
	
	@OneToMany
	@JoinColumn(name="proyecto")
	private List<Asignado_A> asignado_a;
	
	//Constructores
	
	public Proyectos() {
		
	}
	
	public Proyectos(String id, String nombre, int horas) {
		this.id=id;
		this.nombre=nombre;
		this.horas=horas;
	}

	//Setters y getters
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_A")
	public List<Asignado_A> getAsignadoA() {
		return asignado_a;
	}


	public void setAsignadoA(List<Asignado_A> asignado_a) {
		this.asignado_a = asignado_a;
	}

	//To string personalizado
	@Override
	public String toString() {
		return "Proyectos [id = " + id +", nombre = " + nombre +", horas = " + horas +" ] ";
	}
}