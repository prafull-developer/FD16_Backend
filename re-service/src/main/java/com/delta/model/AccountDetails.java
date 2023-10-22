package com.delta.model;


import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Data
@Entity
public class AccountDetails {

	@Id
	private int accountId;
	
	private String accountHolderName;
	
	private double accountNo;
	
	private String accountType;
	
	private double accountBalance;
	
    private String accountStatus;
	
	
	
	
	
	
}
