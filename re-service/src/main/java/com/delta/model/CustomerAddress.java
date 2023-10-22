package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class CustomerAddress {

	@Id
	private int pid;
	
	@OneToOne
	private PermanentAdr paddress;

	@OneToOne
	private LocalAdr laddress;

}
