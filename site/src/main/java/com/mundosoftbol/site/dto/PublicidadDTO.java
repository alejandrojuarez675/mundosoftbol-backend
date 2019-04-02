package com.mundosoftbol.site.dto;

public class PublicidadDTO {

private long id;
	
	private ImagenDTO imagen;
	
	private String nombre;
	
	private String link;
	
	private long tipo;
	
	private long orden;
	
	private boolean activa;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ImagenDTO getImagen() {
		return imagen;
	}

	public void setImagen(ImagenDTO imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public long getTipo() {
		return tipo;
	}

	public void setTipo(long tipo) {
		this.tipo = tipo;
	}

	public long getOrden() {
		return orden;
	}

	public void setOrden(long orden) {
		this.orden = orden;
	}

	public boolean isActiva() {
		return activa;
	}

	public void setActiva(boolean activa) {
		this.activa = activa;
	}

	
}
