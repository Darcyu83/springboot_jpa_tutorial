package com.example.accessingdatajpa.customer.repository;

import com.example.accessingdatajpa.customer.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {


}
