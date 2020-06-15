package com.database_example.database.Interface;

import com.database_example.database.Data.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
