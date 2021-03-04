package com.compramos.tu.coche.es.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.compramos.tu.coche.es.mapper.BrandMapper;
import com.compramos.tu.coche.es.model.Brand;
import com.compramos.tu.coche.es.model.request.BrandRequest;
import com.compramos.tu.coche.es.model.response.BrandResponse;
import com.compramos.tu.coche.es.service.BrandService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class BrandController {
	
	@Autowired
	private BrandService brandService;
	@Autowired
	private BrandMapper brandMapper;
		
	@ApiOperation(value = "Find brand by id or get all brands", notes = "Return a brand or a list of all brands" )
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 204, message = "brand not fount"),
			@ApiResponse(code = 500, message = "Generic Error"),
			@ApiResponse(code = 404, message = "Server error") })
	@RequestMapping(value="/api/brand/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<BrandResponse>> getBrand(@RequestParam(required = false) Long id) {
		List<BrandResponse> brandList = new ArrayList<>();
		try {
			
		
	   if(id == null) {
		   brandMapper.brandToBrandResponseList(brandService.findAll().get()).forEach(brandList::add);
	   }else {
		   Optional<Brand> brand= brandService.findBrandById(id);
		   if(brand.isPresent()) {
			   brandList.add(brandMapper.brandToBrandResponse(brand.get()));
		   }else {
			   return new ResponseEntity<List<BrandResponse>>(HttpStatus.NO_CONTENT);
		   }
	   }
	   return new ResponseEntity<>(brandList, HttpStatus.OK);
		}catch (Exception e) {
			   return new ResponseEntity<>(brandList, HttpStatus.INTERNAL_SERVER_ERROR);
		}
    }
	     
    
	@RequestMapping(value = "/api/brand", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ApiOperation(value = "Create or update an brand", notes = "Create or update a brand")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Create Success"),
			@ApiResponse(code = 500, message = "Generic Error"),
			@ApiResponse(code = 404, message = "Server error") })
    public ResponseEntity<BrandResponse> createOrUpdateCar(@RequestBody BrandRequest brandRequest) {
    	try {	    		
    		Brand brand= brandService.createOrUpdateBrand(brandMapper.brandRequestToBrand(brandRequest));
	        return new ResponseEntity<>(brandMapper.brandToBrandResponse(brand), HttpStatus.CREATED);
    	}catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		  
    }
    
 	    	    
    @SuppressWarnings("rawtypes")
    @RequestMapping(value="/api/brand/{id}",method = RequestMethod.DELETE)
	@ApiOperation(value = "Delete an brand", notes = "Delete a brand by id")
	@ApiResponses(value = { @ApiResponse(code = 204, message = "Delete Success"),
			@ApiResponse(code = 500, message = "Generic Error"),
			@ApiResponse(code = 404, message = "Server error") })
    public ResponseEntity deleteBrand(@RequestParam Long id) {
    	brandService.deleteBrand(id);
        return new ResponseEntity( HttpStatus.NO_CONTENT);
    }
    
	@ApiOperation(value = "Get all models of a brand", notes = "Return a list of models of a brand" )
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success"),
			@ApiResponse(code = 204, message = "Models not fount"),
			@ApiResponse(code = 500, message = "Generic Error"),
			@ApiResponse(code = 404, message = "Server error") })
	@RequestMapping(value="/api/brand/{id}/models",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<String>> getBrandModels(@RequestParam(required = false) Long id) {
		  List<String> modelList = new ArrayList<>();
		   if(id == null) {
			   modelList.addAll(brandService.findAllModels());
		   }else {
			   List<String> models = brandService.findModelsBrandById(id);
			   if(!models.isEmpty()) {
				   modelList.addAll(models);
			   }else {
				   return new ResponseEntity<List<String>>(HttpStatus.NO_CONTENT);
			   }
		   }
		   return new ResponseEntity<>(modelList, HttpStatus.OK);
	    }

}
