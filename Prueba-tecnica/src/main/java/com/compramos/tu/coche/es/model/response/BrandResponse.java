package com.compramos.tu.coche.es.model.response;

public class BrandResponse {
	
	private String idBrand;
	private String name;
	private String foundationYear;
	private String country;
	
	
	public BrandResponse() {
		super();
	}


	public BrandResponse(String idBrand, String name, String foundationYear, String country) {
		super();
		this.idBrand = idBrand;
		this.name = name;
		this.foundationYear = foundationYear;
		this.country = country;
	}


	public String getIdBrand() {
		return idBrand;
	}


	public void setIdBrand(String idBrand) {
		this.idBrand = idBrand;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFoundationYear() {
		return foundationYear;
	}


	public void setFoundationYear(String foundationYear) {
		this.foundationYear = foundationYear;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((foundationYear == null) ? 0 : foundationYear.hashCode());
		result = prime * result + ((idBrand == null) ? 0 : idBrand.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		BrandResponse other = (BrandResponse) obj;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (foundationYear == null) {
			if (other.foundationYear != null)
				return false;
		} else if (!foundationYear.equals(other.foundationYear))
			return false;
		if (idBrand == null) {
			if (other.idBrand != null)
				return false;
		} else if (!idBrand.equals(other.idBrand))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
