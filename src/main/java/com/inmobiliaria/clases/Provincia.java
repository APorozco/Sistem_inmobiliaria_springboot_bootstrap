package com.inmobiliaria.clases;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="provincia")
public class Provincia  {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idprovincia;

	private String descripcion;

	@OneToMany(mappedBy = "provincia")
	private List<Entidad> entidads;

	public Provincia() {
	}

	public Provincia(int idprovincia, String descripcion, List<Entidad> entidads) {
		super();
		this.idprovincia = idprovincia;
		this.descripcion = descripcion;
		this.entidads = entidads;
	}

	public int getIdprovincia() {
		return this.idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Entidad> getEntidads() {
		return this.entidads;
	}

	public void setEntidads(List<Entidad> entidads) {
		this.entidads = entidads;
	}

	public Entidad addEntidad(Entidad entidad) {
		getEntidads().add(entidad);
		entidad.setProvincia(this);

		return entidad;
	}

	public Entidad removeEntidad(Entidad entidad) {
		getEntidads().remove(entidad);
		entidad.setProvincia(null);

		return entidad;
	}

}