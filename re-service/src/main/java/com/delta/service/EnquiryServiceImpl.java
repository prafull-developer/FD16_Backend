package com.delta.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.delta.dao.EnquiryRepository;
import com.delta.model.EnquiryDetails;

@Service
public class EnquiryServiceImpl implements EnquiryService{

	private EnquiryRepository enqRepo;
	
	@Override
	public List<EnquiryDetails> getAlldata() {
		
		return enqRepo.findAll();
	}

	

}
