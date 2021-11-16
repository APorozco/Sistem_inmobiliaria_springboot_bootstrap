package com.inmobiliaria.servicios;

import java.util.List;
import java.util.Optional;

import com.inmobiliaria.clases.Provincia;

public interface ProvinciaService {

	public List<Provincia> listar() ;
	public Optional<Provincia> listar_id(Integer id);
	public Provincia agregar(Provincia prov);
	public void update(Provincia prov);
	public void eliminar(Integer id);
	
}
