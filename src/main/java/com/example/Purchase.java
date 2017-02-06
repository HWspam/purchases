package com.example;

import javax.persistence.*;

/**
 * Created by erikjakubowski on 1/19/17.
 */

@Entity
@Table(name = "purchTable")
public class Purchase {

    public Purchase (){

    }

    @Id
    @GeneratedValue
    int id;

    @Column
    String date;

    @Column
    String creditCard;

    @Column
    String cvv;

    @Column
    String category;

    @ManyToOne
    Customer customer;

    public Purchase(int  id, String date, String creditCard, String cvv, String category, Customer customer) {
        this.id = id;
        this.date = date;
        this.creditCard = creditCard;
        this.cvv = cvv;
        this.category = category;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(String creditCard) {
        this.creditCard = creditCard;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
