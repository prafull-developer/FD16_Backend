package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class LocalAdr {


	@Id
	private int localId;
	
	private String lAreaName;
	
	private String lCityName;
	
	private String lDistrict;
	
	private String lState;
	
	private long lPinCode;
	
	private int lHouseNo;
	
	private String lStreetName;
}
