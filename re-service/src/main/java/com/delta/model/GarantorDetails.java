package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class GarantorDetails {
	
    @Id
	private int gid;
	
	private String gName;
	
	private String gDateOfBirth;
	
	private String gRelationshipwithCustome;
	
	private long gMobile;
	
	private long gAdharCard;
	
	private String gMortgageDetails;
	
	private String gJobDetails;
	
	private String gLocalAddress;
	
	private String gPermanantAddress;
}
