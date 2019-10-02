package com.act.infinity.customer.service;

import com.act.infinity.customer.model.bo.CustomerBO;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  public CustomerBO createCustomer(CustomerBO customer){
    // doing stuff for customer and return result
    CustomerBO response = new CustomerBO();
    response.setId(customer.getId());
    response.setName(customer.getName() + " created");

    return response;
  }

}
