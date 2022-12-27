package com.example.accessingdatajpa.customer.service;

import com.example.accessingdatajpa.customer.vo.CustomerDTO;

import java.util.List;

public interface CustomerService {

    List<CustomerDTO> allCustomer () ;

    CustomerDTO addCustomer(CustomerDTO customer);


}
