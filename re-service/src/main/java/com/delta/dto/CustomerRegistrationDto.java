package com.delta.dto;

import javax.persistence.Lob;

import lombok.Data;

@Data
public class CustomerRegistrationDto {

	//CustomerRegistration
	private int cid;

	private String name;

	private String dob;

	private int age;

	private String gender;

	private String email;

	private long mobileNo;

	private String panCardNo;

	private long adharCardNo;

	private double loanRequired;

	//loanInfo
    private int lid;
	
	private String ltype;
	
		
    //Mortagage
	private int mId;
	
	private double mPropertyValue;
	
	@Lob
	private byte[] mPropertyProof;
	
	private String mPropertyType;
	
	private double mLoanOnProperty;
	
	@Lob
	private byte[] mPropertyInsurance;
	
	
    //profession
	private int pid;
	
	private String ptype;
	
	private double psalary;
	
	private String pDesignation;
	
	@Lob
	private byte[] psalarySlips; 
	
    //local address
	private int localId;
	
	private String lAreaName;
	
	private String lCityName;
	
	private String lDistrict;
	
	private String lState;
	
	private long lPinCode;
	
	private int lHouseNo;
	
	private String lStreetName;
	
    //permanant addresss
	private int permanantId;
	
	private String pAreaName;
	
	private String pCityName;
	
	private String pDistrict;
	
	private String pState;
	
	private long pPinCode;
	
	private int pHouseNo;
	
	private String pStreetName;
	
	
    //previous loan
	private int ploanId;

	private double ploanAmount;

	private int ptenure;

	private double paidAmount;

	private Double remainingAmount;

	private String status;

	private String remark;
	
	
    //Allpersonal docs
	private int documentId;

	@Lob
	private byte[] addressProof;

	@Lob
	private byte[] panCard;

	@Lob
	private byte[] itr;

	@Lob
	private byte[] addharCard;

	@Lob
	private byte[] photo;

	@Lob
	private byte[] signature;

	@Lob
	private byte[] bankCheque;

	@Lob
	private byte[] salaryslips;
	
	
    //account details
	private int accountId;
	
	private String accountHolderName;
	
	private double accountNo;
	
	private String accountType;
	
	private double accountBalance;
	
    private String accountStatus;
	
	//loan details
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
	
	//emi details
	private int emiId;

	private double emiAmountMonthly;

	private String nextEmiDueDate;

	private String previousEmiStatus;

    
}
