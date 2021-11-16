package com.inmobiliaria.clases;


import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_instal database table.
 * 
 */
@Entity
@Table(name="tipo_instal")

public class TipoInstal  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtipoInstal;

	private String descripcion;


	@OneToMany(mappedBy="tipoInstal")
	private List<Instalacion> instalacions;

	public TipoInstal() {
	}

	
	public TipoInstal(int idtipoInstal, String descripcion, List<Instalacion> instalacions) {
		super();
		this.idtipoInstal = idtipoInstal;
		this.descripcion = descripcion;
		this.instalacions = instalacions;
	}


	public int getIdtipoInstal() {
		return this.idtipoInstal;
	}

	public void setIdtipoInstal(int idtipoInstal) {
		this.idtipoInstal = idtipoInstal;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Instalacion> getInstalacions() {
		return this.instalacions;
	}

	public void setInstalacions(List<Instalacion> instalacions) {
		this.instalacions = instalacions;
	}

	public Instalacion addInstalacion(Instalacion instalacion) {
		getInstalacions().add(instalacion);
		instalacion.setTipoInstal(this);

		return instalacion;
	}

	public Instalacion removeInstalacion(Instalacion instalacion) {
		getInstalacions().remove(instalacion);
		instalacion.setTipoInstal(null);

		return instalacion;
	}

}