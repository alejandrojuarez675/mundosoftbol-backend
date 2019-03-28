package com.mundosoftbol.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mundosoftbol.site.entity.Articulo;

@Repository
public interface ArticuloRepository extends CrudRepository<Articulo, Long> {

}
