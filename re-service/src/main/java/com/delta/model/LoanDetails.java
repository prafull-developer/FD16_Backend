package com.delta.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class LoanDetails {
	@Id
	private int loanId;

	private int loanNo;

	private double loanAmount;

	private int reteOfInterest;

	private int tenure;

	private double totalAmonttobePaid;

	private int processingfees;

	private double totalInterest;

	private String sanctionDate;

	private String lremark;

	private String lstatus;

	@OneToOne (cascade = CascadeType.ALL)
	private EMIdetails emiDetails;
	
}
