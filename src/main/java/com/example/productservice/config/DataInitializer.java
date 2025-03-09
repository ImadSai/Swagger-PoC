package com.example.productservice.config;

import com.example.productservice.model.Product;
import com.example.productservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(ProductRepository productRepository) {
        return args -> {
            productRepository.save(new Product("Product A", 10.0));
            productRepository.save(new Product("Product B", 20.0));
            productRepository.save(new Product("Product C", 15.5));
            productRepository.save(new Product("Product D", 7.99));
            productRepository.save(new Product("Product E", 12.49));
        };
    }

}
