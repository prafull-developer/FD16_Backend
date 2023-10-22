package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class PropertyAddress {
	@Id
	private int aid;

	private String areaName;

	private String cityName;

	private String district;

	private String state;

	private double pinCode;

	private String streetName;
}
