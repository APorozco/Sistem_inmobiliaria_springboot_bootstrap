package com.inmobiliaria.clases;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_afectacion")
public class TipoAfectacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idtipoAfectacion;

	private String codigo;

	private String descripcion;

	// bi-directional many-to-one association to Parte
	@OneToMany(mappedBy = "tipoAfectacion")
	private List<Parte> partes;

	public TipoAfectacion() {
	}

	public TipoAfectacion(int idtipoAfectacion, String codigo, String descripcion, List<Parte> partes) {
		super();
		this.idtipoAfectacion = idtipoAfectacion;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.partes = partes;
	}

	public int getIdtipoAfectacion() {
		return this.idtipoAfectacion;
	}

	public void setIdtipoAfectacion(int idtipoAfectacion) {
		this.idtipoAfectacion = idtipoAfectacion;
	}

	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Parte> getPartes() {
		return this.partes;
	}

	public void setPartes(List<Parte> partes) {
		this.partes = partes;
	}

	public Parte addParte(Parte parte) {
		getPartes().add(parte);
		parte.setTipoAfectacion(this);

		return parte;
	}

	public Parte removeParte(Parte parte) {
		getPartes().remove(parte);
		parte.setTipoAfectacion(null);

		return parte;
	}

}