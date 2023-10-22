package com.delta.service;

import java.util.List;

import com.delta.model.CustomerRegistration;

public interface CustomerService {

	

	CustomerRegistration saveData(CustomerRegistration cr);

	CustomerRegistration getSingledata(int cid);

	List<CustomerRegistration> getAlldata();

	CustomerRegistration deleteSingleData(int cid);

	CustomerRegistration deleteAllData();

	

	

}
