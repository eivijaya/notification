package com.repository;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;

@Entity
public class SendSMSAuditLog {

	@Id
	public String id;
	
	public String from_number;
	
	public String to_number;
	
	public String deliver_status;
	
	public String current_date_time;
}
