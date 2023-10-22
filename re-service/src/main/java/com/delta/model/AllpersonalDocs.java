package com.delta.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Data;

@Data
@Entity
public class AllpersonalDocs {

	@Id
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

}
