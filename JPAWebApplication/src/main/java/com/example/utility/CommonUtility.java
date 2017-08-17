package com.example.utility;

import org.springframework.stereotype.Component;

import com.example.entity.Customer;
import com.example.model.FCDVRequest;

@Component
public class CommonUtility {

	
	public Customer populatePojoToEntity(FCDVRequest fcdvRequest) {
		
		Customer customer = new Customer();
		
		if(fcdvRequest.getEmail() != null || fcdvRequest.getEmail() != "") {
			customer.setEmail(fcdvRequest.getEmail());
		}
		
		if(fcdvRequest.getId() != null || fcdvRequest.getId() != "") {
			customer.setId(new Long(fcdvRequest.getId()));
		}
		
		if(fcdvRequest.getName() != null || fcdvRequest.getName() != "") {
			customer.setName(fcdvRequest.getName());
		}
		
		if(fcdvRequest.getPassword() != null || fcdvRequest.getPassword() != "") {
			customer.setPassword(fcdvRequest.getPassword());
		}
		
		if(fcdvRequest.getPhoneNumber() != null || fcdvRequest.getPhoneNumber() != "") {
			customer.setPhoneNumber(fcdvRequest.getPhoneNumber());
		}
		
		return customer;
		
	}
}
