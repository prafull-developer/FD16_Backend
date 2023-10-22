package com.delta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delta.model.EnquiryDetails;
import com.delta.service.EnquiryService;

@RestController
@RequestMapping("/enquiry-service")
public class EnquiryController {

	@Autowired
	private EnquiryService enqService;
	
	@GetMapping("/enquiries")
	public ResponseEntity <List<EnquiryDetails>>getAlldata()
	{
	   return ResponseEntity.status(HttpStatus.OK).body(enqService.getAlldata());
	}

}
