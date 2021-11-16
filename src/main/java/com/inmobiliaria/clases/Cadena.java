package com.inmobiliaria.clases;


import javax.persistence.*;
import java.util.List;



@Entity
@Table(name="cadena")
public class Cadena {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcadena;

	private String logo;

	private String nombre;

	
	@ManyToOne
	@JoinColumn(name="idunidad")
	private Unidad unidad;

	
	@OneToMany(mappedBy="cadena")
	private List<Instalacion> instalacions;

	public Cadena() {
	}

	public int getIdcadena() {
		return this.idcadena;
	}

	public void setIdcadena(int idcadena) {
		this.idcadena = idcadena;
	}

	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Unidad getUnidad() {
		return this.unidad;
	}

	public void setUnidad(Unidad unidad) {
		this.unidad = unidad;
	}

	public List<Instalacion> getInstalacions() {
		return this.instalacions;
	}

	public void setInstalacions(List<Instalacion> instalacions) {
		this.instalacions = instalacions;
	}

	public Instalacion addInstalacion(Instalacion instalacion) {
		getInstalacions().add(instalacion);
		instalacion.setCadena(this);

		return instalacion;
	}

	public Instalacion removeInstalacion(Instalacion instalacion) {
		getInstalacions().remove(instalacion);
		instalacion.setCadena(null);

		return instalacion;
	}

	public Cadena(int idcadena, String logo, String nombre, Unidad unidad, List<Instalacion> instalacions) {
		super();
		this.idcadena = idcadena;
		this.logo = logo;
		this.nombre = nombre;
		this.unidad = unidad;
		this.instalacions = instalacions;
	}
	

}