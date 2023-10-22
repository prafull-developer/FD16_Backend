package com.delta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delta.model.CustomerRegistration;
import com.delta.service.CustomerService;
import com.delta.service.CutomerServiceImpl;

@RestController
@RequestMapping("/customer-reg")
public class CustomerController {

	@Autowired
	private CustomerService custService;
	
	
	
	
	@PostMapping("/customers")
	public ResponseEntity<CustomerRegistration>saveData(@RequestBody CustomerRegistration cr)
	{
	   return ResponseEntity.status(HttpStatus.CREATED).body(custService.saveData(cr));
	}
	
	@GetMapping("/customers/{cid}")
	public ResponseEntity<CustomerRegistration>getSingledata(@PathVariable int cid)
	{
	   return  ResponseEntity.status(HttpStatus.OK).body(custService.getSingledata(cid));
	}
	
	@GetMapping("/customers")
	public ResponseEntity<List<CustomerRegistration>>getAlldata() 
	{
		return ResponseEntity.status(HttpStatus.OK).body(custService.getAlldata());
	}
	
	
	@DeleteMapping("/customers/{cid}")
	public ResponseEntity<CustomerRegistration>deleteSingleData(@PathVariable int cid)
	{
	    return ResponseEntity.status(HttpStatus.OK).body(custService.deleteSingleData(cid));
	}
	
	@DeleteMapping("/customers")
	public ResponseEntity<CustomerRegistration>deleteAllData()
	{
		return ResponseEntity.status(HttpStatus.OK).body(custService.deleteAllData());
	}
	
}