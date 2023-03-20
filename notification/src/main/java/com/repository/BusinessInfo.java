package com.repository;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class BusinessInfo {

	@Id
	public String business_id;
	
	public String business_name;
	
	public String telephone_number;
}
