package com.mundosoftbol.site.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mundosoftbol.site.entity.patoPrueba;

@Repository
public interface PatoPruebaRepository extends CrudRepository<patoPrueba, Long>{
	
}
