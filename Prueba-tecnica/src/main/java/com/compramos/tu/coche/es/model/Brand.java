package com.compramos.tu.coche.es.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idBrand", columnDefinition = "int", nullable = false)
	private Long idBrand;
	@Column(name = "name", columnDefinition = "varchar", length = 255, nullable = false)
	private String name;
	@Column(name = "foundationYear", columnDefinition = "varchar", length = 255, nullable = false)
	private String foundationYear;
	@Column(name = "country", columnDefinition = "varchar", length = 255, nullable = false)
	private String country;
	@OneToMany(mappedBy = "brand", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
	private List<Car> cars;
	
	public Brand() {
		super();
	}


	public Brand(Long idBrand, String name, String foundationYear, String country) {
		super();
		this.idBrand = idBrand;
		this.name = name;
		this.foundationYear = foundationYear;
		this.country = country;
	}


	public Long getIdBrand() {
		return idBrand;
	}


	public void setIdBrand(Long idBrand) {
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
		Brand other = (Brand) obj;
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
