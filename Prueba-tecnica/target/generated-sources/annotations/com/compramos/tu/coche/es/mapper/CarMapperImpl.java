package com.compramos.tu.coche.es.mapper;

import com.compramos.tu.coche.es.model.Brand;
import com.compramos.tu.coche.es.model.Car;
import com.compramos.tu.coche.es.model.request.BrandRequest;
import com.compramos.tu.coche.es.model.request.CarRequest;
import com.compramos.tu.coche.es.model.response.BrandResponse;
import com.compramos.tu.coche.es.model.response.CarResponse;
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
public class CarMapperImpl extends CarMapper {

    @Override
    public CarResponse carToCarResponse(Car car) {
        if ( car == null ) {
            return null;
        }

        CarResponse carResponse = new CarResponse();

        carResponse.setIdCar( car.getIdCar() );
        carResponse.setFuel( car.getFuel() );
        carResponse.setPower( car.getPower() );
        carResponse.setValves( car.getValves() );
        carResponse.setTraction( car.getTraction() );
        carResponse.setModel( car.getModel() );
        carResponse.setYear( String.valueOf( car.getYear() ) );
        carResponse.setBrand( brandToBrandResponse( car.getBrand() ) );
        carResponse.setLength( car.getLength() );
        carResponse.setWidth( car.getWidth() );
        carResponse.setHeight( car.getHeight() );
        carResponse.setWeight( car.getWeight() );
        carResponse.setDepositCapacity( car.getDepositCapacity() );
        carResponse.setPrice( car.getPrice() );

        return carResponse;
    }

    @Override
    public List<CarResponse> carToCarResponseList(List<Car> cars) {
        if ( cars == null ) {
            return null;
        }

        List<CarResponse> list = new ArrayList<CarResponse>( cars.size() );
        for ( Car car : cars ) {
            list.add( carToCarResponse( car ) );
        }

        return list;
    }

    @Override
    public Car carRequestToCar(CarRequest carRequest) {
        if ( carRequest == null ) {
            return null;
        }

        Car car = new Car();

        car.setIdCar( carRequest.getIdCar() );
        car.setFuel( carRequest.getFuel() );
        car.setPower( carRequest.getPower() );
        car.setValves( carRequest.getValves() );
        car.setTraction( carRequest.getTraction() );
        car.setModel( carRequest.getModel() );
        if ( carRequest.getYear() != null ) {
            car.setYear( Integer.parseInt( carRequest.getYear() ) );
        }
        car.setBrand( brandRequestToBrand( carRequest.getBrand() ) );
        car.setLength( carRequest.getLength() );
        car.setWidth( carRequest.getWidth() );
        car.setHeight( carRequest.getHeight() );
        car.setWeight( carRequest.getWeight() );
        car.setDepositCapacity( carRequest.getDepositCapacity() );
        car.setPrice( carRequest.getPrice() );

        return car;
    }

    protected BrandResponse brandToBrandResponse(Brand brand) {
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

    protected Brand brandRequestToBrand(BrandRequest brandRequest) {
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
