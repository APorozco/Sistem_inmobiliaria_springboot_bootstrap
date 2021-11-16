package com.inmobiliaria.clases;


import javax.persistence.*;



@Entity
@Table(name="parte")
public class Parte  {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idparte;

	private int cantidad;

	private String fecha;

	
	private String observacion;


	@ManyToOne
	@JoinColumn(name="idinstalacion")
	private Instalacion instalacion;

	
	@ManyToOne
	@JoinColumn(name="idtipo_afectacion")
	private TipoAfectacion tipoAfectacion;

	public Parte() {
	}

	public int getIdparte() {
		return this.idparte;
	}

	public void setIdparte(int idparte) {
		this.idparte = idparte;
	}

	public int getCantidad() {
		return this.cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getObservacion() {
		return this.observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Instalacion getInstalacion() {
		return this.instalacion;
	}

	public void setInstalacion(Instalacion instalacion) {
		this.instalacion = instalacion;
	}

	public TipoAfectacion getTipoAfectacion() {
		return this.tipoAfectacion;
	}

	public void setTipoAfectacion(TipoAfectacion tipoAfectacion) {
		this.tipoAfectacion = tipoAfectacion;
	}

	public Parte(int idparte, int cantidad, String fecha, String observacion, Instalacion instalacion,
			TipoAfectacion tipoAfectacion) {
		super();
		this.idparte = idparte;
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.observacion = observacion;
		this.instalacion = instalacion;
		this.tipoAfectacion = tipoAfectacion;
	}



	
}