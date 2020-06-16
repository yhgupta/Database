package com.database_example.database.Service;

import com.database_example.database.Data.Customer;
import com.database_example.database.Interface.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    final
    CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getPersonById(int id) {
        return customerRepository.findById(id).get();
    }

    public void delete(int id) {
        customerRepository.deleteById(id);
    }

}
