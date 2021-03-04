package com.compramos.tu.coche.es.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.compramos.tu.coche.es.model.Brand;

@Repository
public interface BrandRepository  extends JpaRepository<Brand, Long> { 
	

}
