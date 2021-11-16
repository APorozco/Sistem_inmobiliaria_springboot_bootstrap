package com.inmobiliaria.clases;


import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the tipo_unidad database table.
 * 
 */
@Entity
@Table(name="tipo_unidad")
public class TipoUnidad {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtipoUnidad;

	private String descripcion;


	@OneToMany(mappedBy="tipoUnidad")
	private List<Unidad> unidads;

	public TipoUnidad() {
	}

	
	public TipoUnidad(int idtipoUnidad, String descripcion, List<Unidad> unidads) {
		super();
		this.idtipoUnidad = idtipoUnidad;
		this.descripcion = descripcion;
		this.unidads = unidads;
	}


	public int getIdtipoUnidad() {
		return this.idtipoUnidad;
	}

	public void setIdtipoUnidad(int idtipoUnidad) {
		this.idtipoUnidad = idtipoUnidad;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Unidad> getUnidads() {
		return this.unidads;
	}

	public void setUnidads(List<Unidad> unidads) {
		this.unidads = unidads;
	}

	public Unidad addUnidad(Unidad unidad) {
		getUnidads().add(unidad);
		unidad.setTipoUnidad(this);

		return unidad;
	}

	public Unidad removeUnidad(Unidad unidad) {
		getUnidads().remove(unidad);
		unidad.setTipoUnidad(null);

		return unidad;
	}

}