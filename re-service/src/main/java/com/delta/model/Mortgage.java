package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class Mortgage {

	@Id
	private int mId;
	
	private double mPropertyValue;
	
	@Lob
	private byte[] mPropertyProof;
	
	private String mPropertyType;
	
	private double mLoanOnProperty;
	
	@Lob
	private byte[] mPropertyInsurance;
}
