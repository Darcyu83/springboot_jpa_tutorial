package com.example.accessingdatajpa.customer.service;

import com.example.accessingdatajpa.customer.model.CustomerDTO;
import com.example.accessingdatajpa.customer.model.CustomerEntity;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> allCustomer () ;

    CustomerDTO addCustomer(CustomerDTO customer);


}
