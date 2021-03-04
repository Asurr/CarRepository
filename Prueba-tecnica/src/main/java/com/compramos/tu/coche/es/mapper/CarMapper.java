package com.compramos.tu.coche.es.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.compramos.tu.coche.es.model.Car;
import com.compramos.tu.coche.es.model.request.CarRequest;
import com.compramos.tu.coche.es.model.response.CarResponse;

@Mapper(componentModel = "spring", uses = {})
public abstract class CarMapper {
		  	  
	public abstract CarResponse carToCarResponse(Car car);
	
	public abstract List<CarResponse> carToCarResponseList (List<Car> cars);
	
	public abstract Car carRequestToCar(CarRequest carRequest);

}
