package com.inmobiliaria.clases;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="unidad")
public class Unidad  {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idunidad;

	private String nombreUnidad;

	
	@OneToMany(mappedBy="unidad")
	private List<Cadena> cadenas;

	
	@ManyToOne
	@JoinColumn(name="identidad")
	private Entidad entidad;

	
	@ManyToOne
	@JoinColumn(name="idtipo_unidad")
	private TipoUnidad tipoUnidad;

	public Unidad() {
	}

	
	public Unidad(int idunidad, String nombreUnidad, List<Cadena> cadenas, Entidad entidad, TipoUnidad tipoUnidad) {
		super();
		this.idunidad = idunidad;
		this.nombreUnidad = nombreUnidad;
		this.cadenas = cadenas;
		this.entidad = entidad;
		this.tipoUnidad = tipoUnidad;
	}


	public int getIdunidad() {
		return this.idunidad;
	}

	public void setIdunidad(int idunidad) {
		this.idunidad = idunidad;
	}

	public String getNombreUnidad() {
		return this.nombreUnidad;
	}

	public void setNombreUnidad(String nombreUnidad) {
		this.nombreUnidad = nombreUnidad;
	}

	public List<Cadena> getCadenas() {
		return this.cadenas;
	}

	public void setCadenas(List<Cadena> cadenas) {
		this.cadenas = cadenas;
	}

	public Cadena addCadena(Cadena cadena) {
		getCadenas().add(cadena);
		cadena.setUnidad(this);

		return cadena;
	}

	public Cadena removeCadena(Cadena cadena) {
		getCadenas().remove(cadena);
		cadena.setUnidad(null);

		return cadena;
	}

	public Entidad getEntidad() {
		return this.entidad;
	}

	public void setEntidad(Entidad entidad) {
		this.entidad = entidad;
	}

	public TipoUnidad getTipoUnidad() {
		return this.tipoUnidad;
	}

	public void setTipoUnidad(TipoUnidad tipoUnidad) {
		this.tipoUnidad = tipoUnidad;
	}

}