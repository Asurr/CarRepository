package com.compramos.tu.coche.es.model.response;

public class CarResponse {
	
	private String idCar;
	private String engine;
	private String engineCode;
	private String fuel;
	private String power;
	private String motorPosition;
	private String valves;
	private Boolean superCharging;	
	private String traction;
	private String model;
	private String year;
	private BrandResponse brand;
	private float length;
	private float width;
	private float height;
	private float weight;
	private float depositCapacity;
	private float price;
	
	
	public CarResponse() {
		super();
	}


	public CarResponse(String idCar, String engine, String engineCode, String fuel, String power, String motorPosition,
			String valves, Boolean superCharging, String traction, String model, String year, BrandResponse brand, float length,
			float width, float height, float weight, float depositCapacity, float price) {
		super();
		this.idCar = idCar;
		this.engine = engine;
		this.engineCode = engineCode;
		this.fuel = fuel;
		this.power = power;
		this.motorPosition = motorPosition;
		this.valves = valves;
		this.superCharging = superCharging;
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


	public String getEngine() {
		return engine;
	}


	public void setEngine(String engine) {
		this.engine = engine;
	}


	public String getEngineCode() {
		return engineCode;
	}


	public void setEngineCode(String engineCode) {
		this.engineCode = engineCode;
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


	public String getMotorPosition() {
		return motorPosition;
	}


	public void setMotorPosition(String motorPosition) {
		this.motorPosition = motorPosition;
	}


	public String getValves() {
		return valves;
	}


	public void setValves(String valves) {
		this.valves = valves;
	}


	public Boolean getSuperCharging() {
		return superCharging;
	}


	public void setSuperCharging(Boolean superCharging) {
		this.superCharging = superCharging;
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


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public BrandResponse getBrand() {
		return brand;
	}


	public void setBrand(BrandResponse brand) {
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
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((engineCode == null) ? 0 : engineCode.hashCode());
		result = prime * result + ((fuel == null) ? 0 : fuel.hashCode());
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + ((idCar == null) ? 0 : idCar.hashCode());
		result = prime * result + Float.floatToIntBits(length);
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((motorPosition == null) ? 0 : motorPosition.hashCode());
		result = prime * result + ((power == null) ? 0 : power.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((superCharging == null) ? 0 : superCharging.hashCode());
		result = prime * result + ((traction == null) ? 0 : traction.hashCode());
		result = prime * result + ((valves == null) ? 0 : valves.hashCode());
		result = prime * result + Float.floatToIntBits(weight);
		result = prime * result + Float.floatToIntBits(width);
		result = prime * result + ((year == null) ? 0 : year.hashCode());
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
		CarResponse other = (CarResponse) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Float.floatToIntBits(depositCapacity) != Float.floatToIntBits(other.depositCapacity))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (engineCode == null) {
			if (other.engineCode != null)
				return false;
		} else if (!engineCode.equals(other.engineCode))
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
		if (motorPosition == null) {
			if (other.motorPosition != null)
				return false;
		} else if (!motorPosition.equals(other.motorPosition))
			return false;
		if (power == null) {
			if (other.power != null)
				return false;
		} else if (!power.equals(other.power))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (superCharging == null) {
			if (other.superCharging != null)
				return false;
		} else if (!superCharging.equals(other.superCharging))
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
		if (year == null) {
			if (other.year != null)
				return false;
		} else if (!year.equals(other.year))
			return false;
		return true;
	}
	
}
