package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Data;


@Data
@Builder
@Entity
public class EnquiryDetails {

	@Id
	private int eid;
	
	private String name;
	
	private String dob;
	
	private int age;
	
	private String gender;
	
	private String email;
	
	private long mobileNo;
	
	private  String panCardNo;
	
	private long addharCardNo;
	
	
}
