package com.interest.calculator.service;

import com.interest.calculator.model.Customer;
import com.interest.calculator.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class CustomerServicelmpl  implements  CustomerService{

    @Autowired
    public CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }
}
