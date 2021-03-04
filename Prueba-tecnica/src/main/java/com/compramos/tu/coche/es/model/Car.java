package com.compramos.tu.coche.es.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "car")
public class Car implements Serializable{
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idCar", columnDefinition = "int", nullable = false)
	private String idCar;
	@Column(name = "fuel" , columnDefinition = "varchar", length = 255, nullable = false)
	private String fuel;
	@Column(name = "power", columnDefinition = "varchar", length = 255, nullable = false)
	private String power;
	@Column(name = "valves", columnDefinition = "varchar", length = 255, nullable = false)
	private String valves;
	@Column(name = "traction", columnDefinition = "varchar", length = 255, nullable = false)
	private String traction;
	@Column(name = "model", columnDefinition = "varchar", length = 255, nullable = false)
	private String model;
	@Column(name = "year", columnDefinition = "int")
	private int year;
	@ManyToOne
	@MapsId("idBrand")
	@JoinColumn(name = "idBrand")
	private Brand brand;
	@Column(name = "length")
	private float length;
	@Column(name = "width")
	private float width;
	@Column(name = "height")
	private float height;
	@Column(name = "weight")
	private float weight;
	@Column(name = "depositCapacity")
	private float depositCapacity;
	@Column(name = "price")
	private float price;
		
	public Car() {
		super();
	}

	public Car(String idCar, String fuel, String power, String valves, String traction, String model, int year,
			Brand brand, float length, float width, float height, float weight, float depositCapacity, float price) {
		super();
		this.idCar = idCar;
		this.fuel = fuel;
		this.power = power;
		this.valves = valves;
		this.traction = traction;
		this.model = model;
		this.year = year;
		this.brand = brand;
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
		this.depositCapacity = depositCapacity;
		this.price = price;
	}

	public String getIdCar() {
		return idCar;
	}

	public void setIdCar(String idCar) {
		this.idCar = idCar;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getValves() {
		return valves;
	}

	public void setValves(String valves) {
		this.valves = valves;
	}

	public String getTraction() {
		return traction;
	}

	public void setTraction(String traction) {
		this.traction = traction;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getDepositCapacity() {
		return depositCapacity;
	}

	public void setDepositCapacity(float depositCapacity) {
		this.depositCapacity = depositCapacity;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + Float.floatToIntBits(depositCapacity);
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + ((idCar == null) ? 0 : idCar.hashCode());
		result = prime * result + Float.floatToIntBits(length);
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((power == null) ? 0 : power.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((traction == null) ? 0 : traction.hashCode());
		result = prime * result + ((valves == null) ? 0 : valves.hashCode());
		result = prime * result + Float.floatToIntBits(weight);
		result = prime * result + Float.floatToIntBits(width);
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Float.floatToIntBits(depositCapacity) != Float.floatToIntBits(other.depositCapacity))
			return false;
		if (fuel == null) {
			if (other.fuel != null)
				return false;
		} else if (!fuel.equals(other.fuel))
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (idCar == null) {
			if (other.idCar != null)
				return false;
		} else if (!idCar.equals(other.idCar))
			return false;
		if (Float.floatToIntBits(length) != Float.floatToIntBits(other.length))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (power == null) {
			if (other.power != null)
				return false;
		} else if (!power.equals(other.power))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (traction == null) {
			if (other.traction != null)
				return false;
		} else if (!traction.equals(other.traction))
			return false;
		if (valves == null) {
			if (other.valves != null)
				return false;
		} else if (!valves.equals(other.valves))
			return false;
		if (Float.floatToIntBits(weight) != Float.floatToIntBits(other.weight))
			return false;
		if (Float.floatToIntBits(width) != Float.floatToIntBits(other.width))
			return false;
		if (year != other.year)
			return false;
		return true;
	}	
	
}
