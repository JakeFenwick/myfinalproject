package com.interest.calculator.model;

import javax.persistence.*;

@Entity
@Table(name = "Customers")

public class Customer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;
    String firstName;
    String lastName;
    String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

