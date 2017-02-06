package com.example;

import javax.persistence.*;

/**
 * Created by erikjakubowski on 1/19/17.
 */

@Entity
@Table (name = "customer")
public class Customer {
    @Id
    @GeneratedValue
    String id;

    @Column
    String name;

    @Column
    String email;

    public Customer() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
