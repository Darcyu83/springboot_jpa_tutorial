package com.example.accessingdatajpa.customer.controller;

import com.example.accessingdatajpa.customer.model.CustomerDTO;
import com.example.accessingdatajpa.customer.model.CustomerEntity;
import com.example.accessingdatajpa.customer.repository.CustomerRepository;
import com.example.accessingdatajpa.customer.service.CustomerService;
import com.example.accessingdatajpa.customer.service.impl.CustomerServiceImpl;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;



class CustomerControllerTest {

    @Autowired
    private CustomerRepository customerRepository;


    @BeforeAll
    static void beforeAll() {
        System.out.println("## BeforeAll Annotation 호출 ##");
        System.out.println();
    }

    @AfterAll
    static void afterAll() {
        System.out.println("## afterAll Annotation 호출 ##");
        System.out.println();
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("## beforeEach Annotation 호출 ##");
        System.out.println();
    }

    @AfterEach
    void afterEach() {
        System.out.println("## afterEach Annotation 호출 ##");
        System.out.println();
    }

    @Test
    void test1() {
        System.out.println("## test1 시작 ##");
        System.out.println();
    }

    @Test
    @DisplayName("Test Case 2!!!")
    void test2() {
        System.out.println("## test2 시작 ##");
        System.out.println();
    }

    @Test
    @Disabled
        // Disabled Annotation : 테스트를 실행하지 않게 설정하는 어노테이션
    void test3() {
        System.out.println("## test3 시작 ##");
        System.out.println();
    }


    @Nested
    @DisplayName("Nested Class Component")
    class CustomerCreator {



        CustomerService customerService = new CustomerServiceImpl();

        private Long id;
        private String firstName;
        private String lastName;
        private String title;
        private String content;
        private CustomerDTO customer;
        private CustomerEntity customerEntity;


        @BeforeEach
         void setDtoUp() {
            title = "타이틀틀";
            content = "컨텐트트";
            customer = new CustomerDTO("DAESEOK", "YU");
            customer.setId(22L);
            System.out.println("## setDtoUp 시작 ##");
            System.out.println();


//            customerService.addCustomer(customer);

        }


        @Test
        void print() {

            System.out.println(customer.toString());
        }
    }


}