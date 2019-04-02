package com.mundosoftbol.site.entity;

public enum TipoArticulo {
	
	Normal(1,"NORMAL","articulo de tamaño normal"),
	MiniArticulo(2,"MINI", "articulo miniatura que va del lado derecho"),
	SoloImagen(3,"IMAGEN","articulo que es solo una imagen")
	;
	
	private long id;
	private String codigo;
	private String descripcion;
	
	private TipoArticulo(long id, String codigo, String descripcion) {
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public long getId() {
		return id;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	public TipoArticulo findById(Long id) {
		for (TipoArticulo tipo : TipoArticulo.values()){
			if (tipo.getId() == id) {
				return tipo;
			}
		}
		return null;
	}
	
	public TipoArticulo findByCodigo(String codigo) {
		for (TipoArticulo tipo : TipoArticulo.values()){
			if (tipo.getCodigo() == codigo) {
				return tipo;
			}
		}
		return null;
	}

}
