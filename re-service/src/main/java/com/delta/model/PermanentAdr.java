package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PermanentAdr {

	@Id
	private int permanantId;
	
	private String pAreaName;
	
	private String pCityName;
	
	private String pDistrict;
	
	private String pState;
	
	private long pPinCode;
	
	private int pHouseNo;
	
	private String pStreetName;
}
