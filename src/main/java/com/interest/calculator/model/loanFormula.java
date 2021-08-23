package com.interest.calculator.model;
import java.util.Scanner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class loanFormula {

    final int numOfMonths = 12;
    final int annualInterest =;
    final int numOfYears =;


    // Create a method for calculating interest/months/years
    float monthlyInterest = annualInterest / numOfMonths;
    int numOfPayments = numOfYears * numOfMonths;

    private double principal;
    double monthlyPayment = principal * (
            (monthlyInterest * (Math.pow(1 + monthlyInterest, numOfPayments))) /
                    ((Math.pow(1 + monthlyInterest, numOfPayments)) - 1)
    );

    double total = monthlyPayment / 100;

}

