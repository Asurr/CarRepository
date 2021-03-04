package com.compramos.tu.coche.es.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.compramos.tu.coche.es.model.Car;

@Repository
public interface CarRepository  extends JpaRepository<Car, Long>{
	
	public static final String FIND_MODELS_BY_IDBRAND = "SELECT distinct c.MODEL FROM CAR c where c.ID_BRAND  = ?1";
	public static final String FIND_ALL_MODELS = "SELECT distinct c.MODEL FROM CAR c";

	
	@Query(value = FIND_MODELS_BY_IDBRAND, nativeQuery = true)
	Optional<List<String>>findModelsByIdBrand(Long idBrand);
	
	@Query(value = FIND_ALL_MODELS, nativeQuery = true)
	Optional<List<String>>findAllModels();
	
}
