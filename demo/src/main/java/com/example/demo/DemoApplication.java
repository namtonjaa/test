package com.example.demo;

import com.example.demo.Model.Product;
import com.example.demo.Repository.ProductRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	ApplicationRunner init(ProductRepository repository) {
		return args -> {
            Product product = new Product();
            product.setName("Product A");
            product.setDesc("Description A");
            product.setCost(10);
            repository.save(product);
            Product product1 = new Product();
            product1.setName("Product B");
            product1.setDesc("Description B");
            product1.setCost(20);
            repository.save(product1);
			repository.findAll().forEach(System.out::println);
		};
	}
}
