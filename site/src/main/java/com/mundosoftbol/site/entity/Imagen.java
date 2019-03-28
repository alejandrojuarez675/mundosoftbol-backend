package com.mundosoftbol.site.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity(name="imagen")
public class Imagen{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre", length = 255)
	private String nombre;
	
	@Column(name = "url",length = 255)
	private String url;
	
	@OneToMany(mappedBy = "imagen", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ArticuloImagen> articuloImagenes;

	@OneToMany(mappedBy = "imagen", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Publicidad> publicidades;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<ArticuloImagen> getArticuloImagenes() {
		return articuloImagenes;
	}

	public void setArticuloImagenes(List<ArticuloImagen> articuloImagenes) {
		this.articuloImagenes = articuloImagenes;
	}
}
