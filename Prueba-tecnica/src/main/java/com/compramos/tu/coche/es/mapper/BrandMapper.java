package com.compramos.tu.coche.es.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.compramos.tu.coche.es.model.Brand;
import com.compramos.tu.coche.es.model.request.BrandRequest;
import com.compramos.tu.coche.es.model.response.BrandResponse;

@Mapper(componentModel = "spring", uses = {})
public abstract class BrandMapper {

	public abstract BrandResponse brandToBrandResponse(Brand brand);
	
	public abstract List<BrandResponse> brandToBrandResponseList(List<Brand> brands);
	
	public abstract Brand brandRequestToBrand(BrandRequest brandRequest);
}

