package com.techprudent.springbootrestvalidation;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerRepo cr;
	
	@PostMapping("/create")
	ResponseEntity<Customer> createCustomer(@Valid @RequestBody Customer customerIn){
		
		Customer customer = this.cr.save(customerIn);
		
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}
}
