package com.example;

import javax.persistence.*;

/**
 * Created by erikjakubowski on 1/19/17.
 */

@Entity
@Table(name = "purchTable")
public class Purchase {
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



}
