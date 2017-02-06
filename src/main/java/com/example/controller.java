package com.example;

import org.hibernate.engine.jdbc.env.spi.SchemaNameResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.PostConstruct;
import java.io.File;
import java.util.List;
import java.util.Scanner;

/**
 * Created by erikjakubowski on 2/5/17.
 */


@Controller
public class controller {

    @Autowired
    CustomerRepository customer;
    @Autowired
    PurchaseRepository purchTable;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String Home (Model model, String catergory) {

        List<Purchase> list;
        if (catergory != null) {
            list = purchTable.findByCategory(catergory);
        }else {
            list = (List<Purchase>) purchTable.findAll();
        }model.addAttribute("purchase", list);
        return "Home";

    }
    @PostConstruct
    public void merge() throws Exception{
        if (customer.count()==0) {
            File f = new File("customers.csv");
            Scanner scanner = new Scanner(f);
            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                String[]strg = str.split(",");
                Customer a = new Customer(strg[0], strg[1], strg[2]);
                customer.save(a);

            }
        }if (purchTable.count()==0){
            File fl = new File("purchases.csv");
            Scanner scnner = new Scanner(fl);
            while (scnner.hasNext()) {
                String st = scnner.nextLine();
                String[]s = st.split(",");
                Purchase pr = new Purchase(s[0], s[1],s[2],s[3],s[4]);
                purchTable.save(pr);
            }

        }
    }


}
