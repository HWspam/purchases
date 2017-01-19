package com.example;

import javax.persistence.*;

/**
 * Created by erikjakubowski on 1/19/17.
 */

@Entity
@Table
public class Customer {
    @Id
    @GeneratedValue
    int id;

    @Column
    String name;

    @Column
    String email;

    public Customer() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
