package com.delta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delta.dao.CustomerRepository;
import com.delta.model.CustomerRegistration;

@Service
public class CutomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerRepository custRepo;
	
	@Override
	public CustomerRegistration saveData(CustomerRegistration cr) {
		
		return custRepo.save(cr);
	}

	@Override
	public CustomerRegistration getSingledata(int cid) {
		
		 custRepo.findById(cid);
		 return null;
	}

	@Override
	public List<CustomerRegistration> getAlldata() {
	
		return custRepo.findAll();
	}

	@Override
	public CustomerRegistration deleteSingleData(int cid) {
	
		 if(custRepo.existsById(cid)) {
			 
			 CustomerRegistration cg = custRepo.findById(cid).get();
			 custRepo.deleteById(cid);
			 return cg;
		 }
			 else 
			 {
			 return null;
			 }
	}

	@Override
	public CustomerRegistration deleteAllData() {
		
	 custRepo.deleteAll();
	 return null;
	}



}
