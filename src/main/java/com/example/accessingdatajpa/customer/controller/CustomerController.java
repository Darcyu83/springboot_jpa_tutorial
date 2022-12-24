package com.example.accessingdatajpa.customer.controller;


import com.example.accessingdatajpa.customer.model.CustomerDTO;
import com.example.accessingdatajpa.customer.model.CustomerEntity;
import com.example.accessingdatajpa.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/")
public class CustomerController {


    @Autowired
    CustomerService customerService;


    private Logger log = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("")
    public String greeting() {

        return "Good to see you";
    }

    @GetMapping("/customers")
    public List<CustomerDTO> allCustomer() {

        return customerService.allCustomer();
    }

    @PostMapping("/customers/save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerInfo) {

//        log.info("saveCustomer in controller :: ", customer);

        log.info(customerInfo.toString());
//        Customer _customer = new Customer((String) customerInfo., (String) vcustomerInfo.get("lastName"));
        return customerService.addCustomer(customerInfo);
    }

    @PostMapping("/customers/save1")
    public CustomerDTO saveCustomer1(@RequestBody Map<String, Object> customerInfo) {
        StringBuilder sb = new StringBuilder();

        customerInfo.entrySet().forEach((props) -> sb.append(props.getKey() + " : " + props.getValue() + "\n"));

        log.info(sb.toString());
        CustomerDTO _customer = new CustomerDTO((String) customerInfo.get("firstName"), (String) customerInfo.get("lastName"));
        return customerService.addCustomer(_customer);
    }
}
