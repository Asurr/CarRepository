package com.compramos.tu.coche.es.service;

import java.util.List;
import java.util.Optional;

import com.compramos.tu.coche.es.model.Brand;

public interface BrandService {

	
	public Optional<Brand> findBrandById(Long id);
	
	public Optional<List<Brand>> findAll();
	
	public Brand createOrUpdateBrand(Brand brand);
	
	public void deleteBrand(Long id);
	
	public List<String> findAllModels();

	public List<String> findModelsBrandById(Long id);

}
