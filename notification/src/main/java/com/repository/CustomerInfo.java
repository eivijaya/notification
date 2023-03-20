package com.repository;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class CustomerInfo {

	@Id
	public String customer_id;
	
	public String customer_name;
	
	public String business_id;
	
	public String customer_telephone_number;
}
