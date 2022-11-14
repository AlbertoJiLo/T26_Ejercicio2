package com.example.T26.dto;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="asignado_a")
public class Asignado_A{
	
	

	//Atributos de la entidad Empleado

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="cientifico")
	private Proyectos proyectos;
	
	@ManyToOne
	@JoinColumn(name="proyecto")
	private Cientificos cientificos;
	
	
	//Constructores
	
	public Asignado_A() {
		
	}
	
	public Asignado_A(Long id,Proyectos proyectos, Cientificos cientificos) {
		this.id=id;
		this.proyectos=proyectos;
		this.cientificos=cientificos;
	}

	//Setters y getters
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Proyectos getProyectos() {
		return proyectos;
	}

	public void setProyectos(Proyectos proyectos) {
		this.proyectos = proyectos;
	}

	public Cientificos getCientificos() {
		return cientificos;
	}

	public void setCientificos(Cientificos cientificos) {
		this.cientificos = cientificos;
	}


	//To string personalizado
	@Override
	public String toString() {
		return "Asignado a [id = " +id+ ",proyectos = " + proyectos +", cientificos = " + cientificos +" ] ";
	}



}
