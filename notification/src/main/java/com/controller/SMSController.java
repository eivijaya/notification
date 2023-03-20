package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.SMSService;

@RestController
@RequestMapping("/sms")
public class SMSController {
	
	@Autowired
	public SMSService smsService;
	
	@PostMapping(value="/send",consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> send(@RequestBody Object obj) {
		return null;
		
	}
	
	@PostMapping(value="/receive",consumes = MediaType.APPLICATION_JSON_VALUE,  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> receive(@RequestBody Object obj) {
		return null;
		
	}
	

}
