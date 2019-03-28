package com.mundosoftbol.site.dto;

import java.time.LocalDateTime;
import java.util.List;

public class ArticuloDTO {
	
	private Long id;
	private LocalDateTime fecha;
	private String titulo;
	private String resumen;
	private String texto;
	private Long tipo;
	private List<ImagenDTO> imagenes;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	public Long getTipo() {
		return tipo;
	}
	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}
	public List<ImagenDTO> getImagenes() {
		return imagenes;
	}
	public void setImagenes(List<ImagenDTO> imagenes) {
		this.imagenes = imagenes;
	}
	
}
