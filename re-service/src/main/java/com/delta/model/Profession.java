package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class Profession {

	@Id
	private int pid;
	
	private String ptype;
	
	private double psalary;
	
	private String pDesignation;
	
	@Lob
	private byte[] psalarySlips; 
	
}
