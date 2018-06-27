package com.matheusjlfm.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusjlfm.cursomc.domain.Categoria;
import com.matheusjlfm.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	//Essa dependencia vai ser automaticamente instanciada pelo Spring.
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}
