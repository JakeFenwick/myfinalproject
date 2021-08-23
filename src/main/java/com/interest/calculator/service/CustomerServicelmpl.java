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
    public List<Customer> getCustomer();
    }
}
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//
//public class Customer {
//
//    final int numOfMonths = 12;
//    final int annualInterest =;
//    final int numOfYears =;
//
//
//    // Create a method for calculating interest/months/years
//    float monthlyInterest = annualInterest / numOfMonths;
//    int numOfPayments = numOfYears * numOfMonths;
//
//    private double principal;
//    double monthlyPayment = principal * (
//            (monthlyInterest * (Math.pow(1 + monthlyInterest, numOfPayments))) /
//                    ((Math.pow(1 + monthlyInterest, numOfPayments)) - 1)
//    );
//
//    double total = monthlyPayment / 100;