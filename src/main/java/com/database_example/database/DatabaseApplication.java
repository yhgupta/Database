package com.database_example.database;

import com.database_example.database.Data.Customer;
import com.database_example.database.Interface.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository){
        return args -> {
            customerRepository.save(new Customer("YASH","GUPTA"));
            customerRepository.save(new Customer("ANANYA YASH","GUPTA"));
        };
    }

//    @Bean
//    CommandLineRunner runner(CustomerRepository customerRepository){
//        return args -> {
//            customerRepository.save(new CustomerTX("YASH GUPTA","yhgupta0408@gmail.com","wugfsidhb","wugfsidhb"));
//            customerRepository.save(new CustomerTX("ANANYA YASH GUPTA","ananyajain2606@gmail.com","wrtwetwert","wrtwetwert"));
//        };
//    }
}
