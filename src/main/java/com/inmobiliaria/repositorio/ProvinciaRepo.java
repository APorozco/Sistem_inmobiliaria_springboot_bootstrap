package com.inmobiliaria.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inmobiliaria.clases.Provincia;

@Repository
public interface ProvinciaRepo extends JpaRepository<Provincia, Integer>{

}
