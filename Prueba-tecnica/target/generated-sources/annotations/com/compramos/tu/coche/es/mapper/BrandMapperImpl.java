package com.compramos.tu.coche.es.mapper;

import com.compramos.tu.coche.es.model.Brand;
import com.compramos.tu.coche.es.model.request.BrandRequest;
import com.compramos.tu.coche.es.model.response.BrandResponse;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-03-04T08:40:44+0100",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 11.0.9 (Oracle Corporation)"
)
@Component
public class BrandMapperImpl extends BrandMapper {

    @Override
    public BrandResponse brandToBrandResponse(Brand brand) {
        if ( brand == null ) {
            return null;
        }

        BrandResponse brandResponse = new BrandResponse();

        if ( brand.getIdBrand() != null ) {
            brandResponse.setIdBrand( String.valueOf( brand.getIdBrand() ) );
        }
        brandResponse.setName( brand.getName() );
        brandResponse.setFoundationYear( brand.getFoundationYear() );
        brandResponse.setCountry( brand.getCountry() );

        return brandResponse;
    }

    @Override
    public List<BrandResponse> brandToBrandResponseList(List<Brand> brands) {
        if ( brands == null ) {
            return null;
        }

        List<BrandResponse> list = new ArrayList<BrandResponse>( brands.size() );
        for ( Brand brand : brands ) {
            list.add( brandToBrandResponse( brand ) );
        }

        return list;
    }

    @Override
    public Brand brandRequestToBrand(BrandRequest brandRequest) {
        if ( brandRequest == null ) {
            return null;
        }

        Brand brand = new Brand();

        if ( brandRequest.getIdBrand() != null ) {
            brand.setIdBrand( Long.parseLong( brandRequest.getIdBrand() ) );
        }
        brand.setName( brandRequest.getName() );
        brand.setFoundationYear( brandRequest.getFoundationYear() );
        brand.setCountry( brandRequest.getCountry() );

        return brand;
    }
}
