package com.database_example.database.Controller;

import com.database_example.database.Data.Customer;
import com.database_example.database.Interface.CustomerRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DatabaseController {

    public DatabaseController(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @RequestMapping("/")
    public String home() {
        return "home.jsp";
    }

    final CustomerRepository customerRepository;

    @RequestMapping("/addCustomer")
    public String addCustomer(Customer customer) {
        customerRepository.save(customer);
        return "home.jsp";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<Customer> getAllUsers() {
        return customerRepository.findAll();
    }

}
