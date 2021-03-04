package com.compramos.tu.coche.es.service;

import java.util.List;
import java.util.Optional;

import com.compramos.tu.coche.es.model.Car;

public interface CarService {
		
	public Optional<Car> findCarById(Long id);
	
	public Optional<List<Car>> findAll();
	
	public Car createOrUpdateCar(Car car);
	
	public void deleteCar(Long id);
	
}
