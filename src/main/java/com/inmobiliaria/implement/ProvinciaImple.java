package com.inmobiliaria.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.inmobiliaria.clases.Provincia;
import com.inmobiliaria.repositorio.ProvinciaRepo;
import com.inmobiliaria.servicios.ProvinciaService;

public class ProvinciaImple implements ProvinciaService {

	@Autowired
	ProvinciaRepo provrepo;

	@Override
	public List<Provincia> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Provincia> listar_id(Integer id) {

		return provrepo.findById(id);
	}

	@Override
	public Provincia agregar(Provincia prov) {

		return provrepo.save(prov);
	}

	@Override
	public void update(Provincia prov) {
		provrepo.save(prov);

	}

	@Override
	public void eliminar(Integer id) {
		provrepo.deleteById(id);

	}

}
