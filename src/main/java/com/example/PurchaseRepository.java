package com.example;

import com.sun.javafx.collections.ListListenerHelper;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by erikjakubowski on 1/19/17.
 */


public interface PurchaseRepository extends CrudRepository <Purchase,Integer>{

    List<Purchase> findByCategory (String category);
    List<Purchase> findByDate (String date);
    List<Purchase> findByCreditCard (String creditCard);


}
