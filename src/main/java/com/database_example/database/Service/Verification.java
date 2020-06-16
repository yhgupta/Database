package com.database_example.database.Service;

import com.database_example.database.Data.Customer;
import org.springframework.beans.factory.annotation.Autowired;


public class Verification {

    String name, password;

    public Verification(String name, String password) {
        this.name = name;
        this.password = password;
    }

}
