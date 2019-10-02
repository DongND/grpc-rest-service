package com.act.infinity.customer.converter;

import com.act.infinity.customer.grpc.CreateCustomerResponse;
import com.act.infinity.customer.model.bo.CustomerBO;
import com.act.infinity.customer.model.dto.CustomerDTO;

public interface ResponseConverter {

  CreateCustomerResponse createProtoResponse(CustomerBO obj);
  CustomerDTO createDTO(CustomerBO obj);

}
