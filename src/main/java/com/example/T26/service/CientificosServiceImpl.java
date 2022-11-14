package com.example.T26.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.T26.dao.ICientificosDAO;
import com.example.T26.dto.Cientificos;

@Service
public class CientificosServiceImpl implements ICientificosService{
	
	//Utilizamos los metodos de la interface ICientificoDAO, es como si instanciaramos.
	@Autowired
	ICientificosDAO iCientificoDAO;
	
	@Override
	public List<Cientificos> listarCientificos() {
		return iCientificoDAO.findAll();
	}
	
	@Override
	public Cientificos crearCientifico(Cientificos cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientificos leerCientifico(String dni) {
		return iCientificoDAO.findById(dni).get();
	}


	@Override
	public Cientificos actualizarCientifico(Cientificos cientifico) {
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void borrarCientifico(String dni) {
		iCientificoDAO.deleteById(dni);
	}


}
