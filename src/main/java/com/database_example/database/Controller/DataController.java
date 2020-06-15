package com.database_example.database.Controller;

import com.database_example.database.Connection.HTTP;
import com.database_example.database.Data.Customer;
import com.database_example.database.Data.Stock;
import com.database_example.database.Service.CustomerService;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
public class DataController {
    public DataController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/information")
    public Stock stock(@RequestParam(value = "name") String name) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
        return objectMapper.readValue(HTTP.getData(name), Stock.class);
    }

    final
    CustomerService customerService;

    @GetMapping("/customer/{id}")
    private Customer getPerson(@PathVariable("id") int id) {
        return customerService.getPersonById(id);
    }

    @DeleteMapping("/persons/{id}")
    private void deletePerson(@PathVariable("id") int id) {
        customerService.delete(id);
    }

}
