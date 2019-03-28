package com.mundosoftbol.site.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.CreationTimestamp;

@Entity(name="articulo")
public class Articulo{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@CreationTimestamp
	@Column(name = "fecha")
	private LocalDateTime fecha;
	
	@Column(name = "titulo", length = 255)
	private String titulo;
	
	@Column(name = "resumen", length = 500)
	private String resumen;
	
	@Column(name = "texto", length = 3000)
	private String texto;
	
	@Column(name = "tipo")
	private Long tipo;

	@OneToMany(mappedBy = "articulo", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
	private List<ArticuloImagen> articuloImagenes;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public long getTipo() {
		return tipo;
	}

	public void setTipo(long tipo) {
		this.tipo = tipo;
	}

	public List<ArticuloImagen> getArticuloImagenes() {
		return articuloImagenes;
	}

	public void setArticuloImagenes(List<ArticuloImagen> articuloImagenes) {
		this.articuloImagenes = articuloImagenes;
	}
}
