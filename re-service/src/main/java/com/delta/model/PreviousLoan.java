package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PreviousLoan {
	@Id
	private int ploanId;

	private double ploanAmount;

	private int ptenure;

	private double paidAmount;

	private Double remainingAmount;

	private String status;

	private String remark;

}
