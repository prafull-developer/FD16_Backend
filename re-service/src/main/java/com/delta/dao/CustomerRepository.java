package com.delta.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delta.model.CustomerRegistration;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerRegistration, Integer>{

}
