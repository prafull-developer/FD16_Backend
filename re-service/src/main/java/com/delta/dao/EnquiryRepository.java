package com.delta.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.delta.model.EnquiryDetails;

@Repository
public interface EnquiryRepository extends JpaRepository<EnquiryDetails, Integer>{

}
