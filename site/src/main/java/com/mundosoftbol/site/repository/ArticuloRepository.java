package com.mundosoftbol.site.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mundosoftbol.site.entity.Articulo;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, Long> {

	@Query(value = "SELECT * FROM articulo ORDER BY id DESC LIMIT 10", nativeQuery = true)
	List<Articulo> findTop10();
}
