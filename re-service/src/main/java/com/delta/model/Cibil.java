package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Cibil {

	@Id
	private int cibilId;

	private int cibilScore;

	private String cibilScoreDateTime;

	private String status;

	private String remark;
}
