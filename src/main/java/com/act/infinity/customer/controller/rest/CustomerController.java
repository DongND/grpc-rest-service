package com.act.infinity.customer.controller.rest;

import com.act.infinity.customer.converter.RequestConverter;
import com.act.infinity.customer.converter.ResponseConverter;
import com.act.infinity.customer.model.dto.CustomerDTO;
import com.act.infinity.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

	@Autowired
	CustomerService customerService;

	@Autowired
	RequestConverter requestConverter;

	@Autowired
	ResponseConverter responseConverter;

	@PostMapping("/api/v1/customer")
	public CustomerDTO createCustomer(@RequestBody CustomerDTO customer){
		return responseConverter.createDTO(
				customerService.createCustomer(requestConverter.createBO(customer)));
	}
}
