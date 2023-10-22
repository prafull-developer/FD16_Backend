package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class EMIdetails {

	@Id
	private int emiId;

	private double emiAmountMonthly;

	private String nextEmiDueDate;

	private String previousEmiStatus;

}
