package com.example.T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T26.dao.IAsignado_ADAO;
import com.example.T26.dto.Proyectos;
import com.example.T26.dto.Asignado_A;

@Service
public class Asignado_AServiceImpl implements IAsignado_AService{
	
	//Utilizamos los metodos de la interface IAsignado_ADAO, es como si instanciaramos.
	@Autowired
	IAsignado_ADAO iAsignado_ADAO;
	
	@Override
	public List<Asignado_A> listarAsignados_A() {
		return iAsignado_ADAO.findAll();
	}
	
	@Override
	public Asignado_A leerAsignado_A(Long id) {
		return iAsignado_ADAO.findById(id).get();
	}
	
	@Override
	public Asignado_A crearAsignado_A(Asignado_A asignado_a) {
		return iAsignado_ADAO.save(asignado_a);
	}


	@Override
	public Asignado_A actualizarAsignado_A(Asignado_A asignado_a) {
		return iAsignado_ADAO.save(asignado_a);
	}

	@Override
	public void borrarAsignado_A(Long id) {
		iAsignado_ADAO.deleteById(id);
	}

		



}
