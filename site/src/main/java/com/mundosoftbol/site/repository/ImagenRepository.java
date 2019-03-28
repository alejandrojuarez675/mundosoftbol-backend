package com.mundosoftbol.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mundosoftbol.site.entity.Imagen;

@Repository
public interface ImagenRepository extends CrudRepository<Imagen, Long> {

}
