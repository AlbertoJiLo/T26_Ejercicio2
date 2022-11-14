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
@Table(name="cientificos")

public class Cientificos {

	//Atributos de la entidad Empleado
	@Id
	private String dni;
	private String nomapels;
	
	@OneToMany
	@JoinColumn(name="cientifico")
	private List<Asignado_A> asignado_a;
	
	//Constructores
	
	public Cientificos() {
		
	}
	
	public Cientificos(String dni, String nomapels) {
		this.dni=dni;
		this.nomapels=nomapels;
	}

	//Getters setters
	

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomapels() {
		return nomapels;
	}

	public void setNomapels(String nomapels) {
		this.nomapels = nomapels;
	}
	
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Asignado_A")
	public List<Asignado_A> getAsignado_a() {
		return asignado_a;
	}

	public void setAsignado_a(List<Asignado_A> asignado_a) {
		this.asignado_a = asignado_a;
	}


	//To string personalizado
	@Override
	public String toString() {
		return "Cientificos [dni = " + dni +", nombre y apellidos = " + nomapels +" ] ";
	}
}
