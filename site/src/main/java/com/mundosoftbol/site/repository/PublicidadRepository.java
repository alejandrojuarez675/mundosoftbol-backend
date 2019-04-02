package com.mundosoftbol.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mundosoftbol.site.entity.Publicidad;

@Repository
public interface PublicidadRepository extends CrudRepository<Publicidad, Long>{

	@Query(value = "SELECT * FROM publicidad WHERE activa = true ORDER BY orden ASC", nativeQuery = true)
	List<Publicidad> findOrderByOrden();
}
