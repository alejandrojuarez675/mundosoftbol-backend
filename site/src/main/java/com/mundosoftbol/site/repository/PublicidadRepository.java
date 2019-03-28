package com.mundosoftbol.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mundosoftbol.site.entity.Publicidad;

@Repository
public interface PublicidadRepository extends CrudRepository<Publicidad, Long>{

}
