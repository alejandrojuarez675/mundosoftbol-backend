package com.mundosoftbol.site.entity;

public enum TipoPublicidad {

	
	Normal(1,"NORMAL","publidad de tamaño normal"),
	Grande(2,"GRANDE", "publicidad gigante tipo banner")
	;
	
	private long id;
	private String codigo;
	private String descripcion;
	
	private TipoPublicidad(long id, String codigo, String descripcion) {
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
	
	public TipoPublicidad findById(Long id) {
		for (TipoPublicidad tipo : TipoPublicidad.values()){
			if (tipo.getId() == id) {
				return tipo;
			}
		}
		return null;
	}
	
	public TipoPublicidad findByCodigo(String codigo) {
		for (TipoPublicidad tipo : TipoPublicidad.values()){
			if (tipo.getCodigo() == codigo) {
				return tipo;
			}
		}
		return null;
	}

	
}
