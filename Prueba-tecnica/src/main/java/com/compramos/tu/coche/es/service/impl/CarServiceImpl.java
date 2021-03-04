package com.compramos.tu.coche.es.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compramos.tu.coche.es.model.Car;
import com.compramos.tu.coche.es.repository.CarRepository;
import com.compramos.tu.coche.es.service.CarService;


@Service("carService")
public class CarServiceImpl implements CarService {
	
	@Autowired
	private CarRepository carRepository;
	
	@Override
	public Optional<Car> findCarById(Long id) {
		return carRepository.findById(id);
	}

	@Override
	public Car createOrUpdateCar(Car car) {
		return carRepository.save(car);
	}

	@Override
	public void deleteCar(Long id) {
		carRepository.deleteById(id);		
	}

	@Override
	public Optional<List<Car>> findAll() {		
		return Optional.ofNullable(carRepository.findAll());
	}		

}
