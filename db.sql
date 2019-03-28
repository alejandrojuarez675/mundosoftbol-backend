-- 27/03/2018
-- primera db

CREATE TABLE articulo (
    	id bigint PRIMARY KEY ,
	fecha timestamp not null,
    	titulo varchar(255),
    	resumen varchar(500),
    	texto varchar(3000),
	tipo bigint not null
);

CREATE TABLE imagen (
    	id bigint PRIMARY KEY,
	nombre varchar(255),
	url varchar(255)
);

CREATE TABLE articulo_imagen(
    	id bigint PRIMARY KEY,
    	articulo_id bigint not null,
    	imagen_id bigint not null,

    	CONSTRAINT articulo_imagen_articulo_id_fkey FOREIGN KEY (articulo_id) REFERENCES articulo(id)

,
    	CONSTRAINT articulo_imagen_imagen_id_fkey FOREIGN KEY (imagen_id) REFERENCES imagen(id)


);

CREATE TABLE publicidad(
	id bigint PRIMARY KEY,
    	imagen_id bigint not null,
	nombre varchar(100),
	link varchar(255),
	tipo bigint not null,
	orden bigint not null,

    	CONSTRAINT publicidad_imagen_id_fkey FOREIGN KEY (imagen_id) REFERENCES imagen(id)


);

CREATE TABLE usuario(
	id bigint PRIMARY KEY,
	nombre varchar(100),
	contrasena varchar(500)	
);