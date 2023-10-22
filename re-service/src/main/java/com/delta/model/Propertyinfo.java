package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Propertyinfo {

	@Id
	private int propertyId;
	
	private String propertyType;
	
	private String propertyArea;
	
	private double propertyPrice;
	
	@Lob
	private byte[] propertyProof;
	
	@Lob
	private byte[] priceProof;
	
	@OneToOne
	private PropertyAddress propertyAddress;
	
	
	
	
}
