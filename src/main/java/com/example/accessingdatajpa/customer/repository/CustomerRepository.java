package com.example.accessingdatajpa.customer.repository;

import com.example.accessingdatajpa.customer.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {


}
