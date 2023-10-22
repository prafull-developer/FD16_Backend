package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class LoanInfo {

	@Id
	private int lid;
	
	private String ltype;
	
	//@ManyToOne
	//private CustomerRegistration cr;
	
}
