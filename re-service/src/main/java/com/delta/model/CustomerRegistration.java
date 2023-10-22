package com.delta.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import lombok.Data;

@Entity
@Data
public class CustomerRegistration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@OneToMany (cascade = CascadeType.ALL)
	private List<LoanInfo> cLoanInfo;

	@OneToOne(cascade = CascadeType.ALL)
	private CustomerAddress cAddress;

	@OneToOne (cascade = CascadeType.ALL)
	private Mortgage cMortgageDetails;

	@OneToOne (cascade = CascadeType.ALL)
	private AllpersonalDocs cAllpersonalDocs;

	@OneToOne
	private Profession cProfession;

	@OneToOne
	private Cibil cCibil;

	@OneToOne
	private AccountDetails cAccountDetails;

	@OneToOne
	private LoanDetails cLoanDetails;

	@OneToMany(cascade = CascadeType.ALL)
	private List<PreviousLoan> cPreviousLoan;

	@OneToOne
	private Propertyinfo cPropertyInfo;

	@OneToOne
	private GarantorDetails cGarantorDetails;
}
