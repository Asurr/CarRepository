package com.compramos.tu.coche.es.service.impl;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.compramos.tu.coche.es.model.Brand;
import com.compramos.tu.coche.es.repository.BrandRepository;
import com.compramos.tu.coche.es.repository.CarRepository;
import com.compramos.tu.coche.es.service.BrandService;

@Service("brandService")
public class BrandServiceImpl implements BrandService {
	
	@Autowired
	private BrandRepository brandRepository;
	@Autowired
	private CarRepository carRepository;

	@Override
	public Optional<Brand> findBrandById(Long id) {		
		return this.brandRepository.findById(id);
	}

	@Override
	public Optional<List<Brand>> findAll() {		
		return Optional.ofNullable(this.brandRepository.findAll());
	}

	@Override
	public Brand createOrUpdateBrand(Brand brand) {		
		return brandRepository.save(brand);
	}

	@Override
	public void deleteBrand(Long id) {
		brandRepository.deleteById(id);		
	}

	@Override
	public List<String> findModelsBrandById(Long id) {		
		Optional<List<String>> optionalModelList;
		optionalModelList= carRepository.findModelsByIdBrand(id);
		if(optionalModelList.isPresent()) {
			return optionalModelList.get();
		}else {
			return Collections.emptyList();
		}
	}


	@Override
	public List<String> findAllModels() {
		Optional<List<String>> listOptionalModels =carRepository.findAllModels();
		if(listOptionalModels.isPresent()) {
			return listOptionalModels.get();
		}else {
			return Collections.emptyList();
		}		
		
	}
	

}
