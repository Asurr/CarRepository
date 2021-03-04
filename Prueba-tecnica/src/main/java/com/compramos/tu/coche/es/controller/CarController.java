package com.compramos.tu.coche.es.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compramos.tu.coche.es.mapper.CarMapper;
import com.compramos.tu.coche.es.model.Brand;
import com.compramos.tu.coche.es.model.Car;
import com.compramos.tu.coche.es.model.request.CarRequest;
import com.compramos.tu.coche.es.model.response.CarResponse;
import com.compramos.tu.coche.es.service.BrandService;
import com.compramos.tu.coche.es.service.CarService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@Validated
public class CarController {
		
		private final CarService carService;
		private final BrandService brandService;
		@Autowired
		private CarMapper carMapper;
		
		public CarController(CarService carService,BrandService brandService) {
			this.carService = carService;
			this.brandService = brandService;
		}
				
	
		@ApiOperation(value = "Find car by id or get all cars", notes = "Return a car or a list of all cars" )
		@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
				@ApiResponse(code = 204, message = "Car not fount"),
				@ApiResponse(code = 500, message = "Generic Error"),
				@ApiResponse(code = 404, message = "Server error") })
		@RequestMapping(value="/api/car/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	    public ResponseEntity<List<CarResponse>> getCar(@RequestParam(required = false) Long id) {
		  List<CarResponse> carList = new ArrayList<>();
		   if(id == null) {
			   carMapper.carToCarResponseList(carService.findAll().get()).forEach(carList::add);
		   }else {
			   Optional<Car> car= carService.findCarById(id);
			   if(car.isPresent()) {
				   carList.add(carMapper.carToCarResponse(car.get()));
			   }
		   }
		   if(carList.isEmpty()) {
				   return new ResponseEntity<List<CarResponse>>(HttpStatus.NO_CONTENT);	   
		   }
		   return new ResponseEntity<>(carList, HttpStatus.OK);
	    }
		        
	    
		@RequestMapping(value = "/api/car", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
		@ApiOperation(value = "Create or update an car", notes = "Create or update a car")
		@ApiResponses(value = { @ApiResponse(code = 201, message = "Create Success"),
				@ApiResponse(code = 500, message = "Generic Error"),
				@ApiResponse(code = 404, message = "Server error") })
	    public ResponseEntity<CarResponse> createOrUpdateCar(@Valid @RequestBody CarRequest carRequest) {
	    	try {	    
	    		Optional<Brand> myBrand = brandService.findBrandById(Long.valueOf(carRequest.getBrand().getIdBrand()));
	    		if(myBrand.isPresent()) {
	    			Car mycar = carMapper.carRequestToCar(carRequest);
	    			mycar.setBrand(myBrand.get());
	    			Car car= carService.createOrUpdateCar(mycar);
	    	        return new ResponseEntity<>(carMapper.carToCarResponse(car), HttpStatus.CREATED);			  
	    		}
	    		
	    	}catch (Exception e) {
				return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
			}
	        return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);			  
	    }
	    
	 	    	    
	    @SuppressWarnings("rawtypes")
	    @RequestMapping(value="/api/car/{id}",method = RequestMethod.DELETE)
		@ApiOperation(value = "Delete an car", notes = "Delete a car by id")
		@ApiResponses(value = { @ApiResponse(code = 204, message = "Delete Success"),
				@ApiResponse(code = 500, message = "Generic Error"),
				@ApiResponse(code = 404, message = "Server error") })
	    public ResponseEntity deleteCar(@RequestParam Long id) {
	    	try {
	    	carService.deleteCar(id);
	    	}catch (Exception e) {
	    		   return new ResponseEntity( HttpStatus.INTERNAL_SERVER_ERROR);
			}
	        return new ResponseEntity( HttpStatus.NO_CONTENT);
	    }
}
