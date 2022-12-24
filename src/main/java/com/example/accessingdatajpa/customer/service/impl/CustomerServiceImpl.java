package com.example.accessingdatajpa.customer.service.impl;

import com.example.accessingdatajpa.customer.model.CustomerDTO;
import com.example.accessingdatajpa.customer.model.CustomerEntity;
import com.example.accessingdatajpa.customer.repository.CustomerRepository;
import com.example.accessingdatajpa.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerServiceImpl implements CustomerService {


    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerDTO> allCustomer() {


        List<CustomerEntity> customers = customerRepository.findAll();

        List<CustomerDTO> list = new ArrayList<CustomerDTO>();


        customers.forEach(customer -> {
            list.add(new CustomerDTO(customer.getFirstName() + " all done", customer.getLastName() + " all done"));
        });

        return list;
    }

    @Override
    public CustomerDTO addCustomer(CustomerDTO customer) {


        CustomerEntity done = customerRepository.save(new CustomerEntity(customer.getFirstName(), customer.getLastName()));

        return new CustomerDTO(done.getFirstName() + " save done", done.getLastName() + " save done");
    }
}
