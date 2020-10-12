package com.techdenovo.app.secondspringbootproject1.service;

import com.techdenovo.app.secondspringbootproject1.domain.Customer;
import com.techdenovo.app.secondspringbootproject1.repositry.CustomerRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepositry customerRepositry;


    public List<Customer> getCustomers() {

        return  customerRepositry.findAll();
    }
    public Customer createStudent(Customer student) {            //insert the  new record into table

        return customerRepositry.save(student);
    }

    public Customer updateStudent(Customer customer, Long id) {
        Customer studentExisting = customerRepositry.findById(id).orElse(null);
        if (studentExisting != null) {
            studentExisting.setName(customer.getName());
        } else {
            return null;
        }
        return customerRepositry.save(customer);
    }


}
