package com.example.accessingdatajpa.customer.controller;

import com.example.accessingdatajpa.customer.vo.CustomerDTO;
import com.example.accessingdatajpa.customer.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {


    @Autowired
    CustomerService customerService;


    private Logger log = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("")
    public String greeting() {
        return "Hi. Welcome";
    }

    @GetMapping("/customers")
    public List<CustomerDTO> allCustomer() {

        return customerService.allCustomer();
    }

    @PostMapping("/customers/save")
    public CustomerDTO saveCustomer(@RequestBody CustomerDTO customerInfo) {
        log.info(customerInfo.toString());
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
