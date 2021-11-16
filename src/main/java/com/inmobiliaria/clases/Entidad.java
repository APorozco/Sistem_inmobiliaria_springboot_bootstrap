package com.inmobiliaria.clases;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="entidad")
public class Entidad {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int identidad;

	private String direccion;

	private String nombre;

	private String telefono;

	@ManyToOne
	@JoinColumn(name="idprovincia")
	private Provincia provincia;

	@OneToMany(mappedBy="entidad")
	private List<Unidad> unidads;

	public Entidad() {
	}

	public int getIdentidad() {
		return this.identidad;
	}

	public void setIdentidad(int identidad) {
		this.identidad = identidad;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Provincia getProvincia() {
		return this.provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public List<Unidad> getUnidads() {
		return this.unidads;
	}

	public void setUnidads(List<Unidad> unidads) {
		this.unidads = unidads;
	}

	public Unidad addUnidad(Unidad unidad) {
		getUnidads().add(unidad);
		unidad.setEntidad(this);

		return unidad;
	}

	public Unidad removeUnidad(Unidad unidad) {
		getUnidads().remove(unidad);
		unidad.setEntidad(null);

		return unidad;
	}

	public Entidad(int identidad, String direccion, String nombre, String telefono, Provincia provincia,
			List<Unidad> unidads) {
		super();
		this.identidad = identidad;
		this.direccion = direccion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.provincia = provincia;
		this.unidads = unidads;
	}

	@Override
	public String toString() {
		return "Entidad [identidad=" + identidad + ", direccion=" + direccion + ", nombre=" + nombre + ", telefono="
				+ telefono + ", provincia=" + provincia + ", unidads=" + unidads + "]";
	}

}