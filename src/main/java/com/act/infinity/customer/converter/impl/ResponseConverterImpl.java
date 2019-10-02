package com.act.infinity.customer.converter.impl;

import com.act.infinity.customer.converter.ResponseConverter;
import com.act.infinity.customer.grpc.CreateCustomerResponse;
import com.act.infinity.customer.grpc.Customer;
import com.act.infinity.customer.model.bo.CustomerBO;
import com.act.infinity.customer.model.dto.CustomerDTO;
import org.springframework.stereotype.Service;

@Service
public class ResponseConverterImpl implements ResponseConverter {

  @Override
  public CreateCustomerResponse createProtoResponse(CustomerBO input){
    CreateCustomerResponse response = CreateCustomerResponse.newBuilder()
        .setResponse(
            Customer.newBuilder()
                .setId(input.getId())
                .setName(input.getName())
                .build())
        .build();
    return response;
  }

  @Override
  public CustomerDTO createDTO(CustomerBO input){
    CustomerDTO response = new CustomerDTO();
    response.setId(input.getId());
    response.setName(input.getName());
    return response;
  }

}
