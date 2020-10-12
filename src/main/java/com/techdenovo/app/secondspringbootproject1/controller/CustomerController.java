package com.techdenovo.app.secondspringbootproject1.controller;

import com.techdenovo.app.secondspringbootproject1.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import com.techdenovo.app.secondspringbootproject1.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

  public List<Customer>getAllCustomers(){

       List<Customer>customers=customerService.getCustomers();
            return customers;

  }
    @PostMapping("/addcustomer")
    public Customer addCustomer(@RequestBody Customer customer){

        return customerService.createStudent(customer);
    }

}
