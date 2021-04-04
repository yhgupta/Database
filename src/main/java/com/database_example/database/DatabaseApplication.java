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
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            customerRepository.save(new Customer("YASH GUPTA", "yhgupta0408@gmail.com", "uyfvisudb", "uyfvisudb"));
            customerRepository.save(new Customer("ANANYA JAIN", "ananyajain2606@gmail.com", "rfaashbvu", "rfaashbvu"));
        };
    }

//    @Bean
//    CommandLineRunner runner(CustomerRepository customerRepository){
//        return args -> {
//            customerRepository.save(new CustomerTX("YASH GUPTA","yhgupta0408@gmail.com","wugfsidhb","wugfsidhb"));
//        };
//    }
}
