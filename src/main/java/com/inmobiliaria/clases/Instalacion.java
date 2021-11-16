package com.inmobiliaria.clases;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="instalacion")
public class Instalacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idinstalacion;

	
	private int cantHab;
	
	private String nombre;

	@ManyToOne
	@JoinColumn(name = "idcadena")
	private Cadena cadena;

	
	@ManyToOne
	@JoinColumn(name = "idtipo_instal")
	private TipoInstal tipoInstal;

	
	@OneToMany(mappedBy = "instalacion")
	private List<Parte> partes;

	public Instalacion() {
	}

	public int getIdinstalacion() {
		return this.idinstalacion;
	}

	public void setIdinstalacion(int idinstalacion) {
		this.idinstalacion = idinstalacion;
	}

	public int getCantHab() {
		return this.cantHab;
	}

	public void setCantHab(int cantHab) {
		this.cantHab = cantHab;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cadena getCadena() {
		return this.cadena;
	}

	public void setCadena(Cadena cadena) {
		this.cadena = cadena;
	}

	public TipoInstal getTipoInstal() {
		return this.tipoInstal;
	}

	public void setTipoInstal(TipoInstal tipoInstal) {
		this.tipoInstal = tipoInstal;
	}

	public List<Parte> getPartes() {
		return this.partes;
	}

	public void setPartes(List<Parte> partes) {
		this.partes = partes;
	}

	public Parte addParte(Parte parte) {
		getPartes().add(parte);
		parte.setInstalacion(this);

		return parte;
	}

	public Parte removeParte(Parte parte) {
		getPartes().remove(parte);
		parte.setInstalacion(null);

		return parte;
	}

}