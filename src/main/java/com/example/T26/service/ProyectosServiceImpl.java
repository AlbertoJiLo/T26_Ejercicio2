package com.example.T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T26.dao.IProyectosDAO;
import com.example.T26.dto.Proyectos;

@Service
public class ProyectosServiceImpl implements IProyectosService{
	
	//Utilizamos los metodos de la interface IProyectoDAO, es como si instanciaramos.
	@Autowired
	IProyectosDAO iProyectoDAO;
	
	@Override
	public List<Proyectos> listarProyectos() {
		return iProyectoDAO.findAll();
	}
	
	@Override
	public Proyectos crearProyecto(Proyectos codigo) {
		return iProyectoDAO.save(codigo);
	}

	@Override
	public Proyectos leerProyecto(String id) {
		return iProyectoDAO.findById(id).get();
	}


	@Override
	public Proyectos actualizarProyecto(Proyectos proyecto) {
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void borrarProyecto(String id) {
		iProyectoDAO.deleteById(id);
	}

}