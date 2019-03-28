package com.mundosoftbol.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mundosoftbol.site.entity.ArticuloImagen;

@Repository
public interface ArticuloImagenRepository extends CrudRepository<ArticuloImagen, Long>{

}
