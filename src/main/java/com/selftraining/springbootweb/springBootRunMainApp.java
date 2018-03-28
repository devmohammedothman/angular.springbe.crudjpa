package com.selftraining.springbootweb;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.selftraining.springbootweb.dao.CarRepository;
import com.selftraining.springbootweb.model.Car;

@SpringBootApplication
public class springBootRunMainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(springBootRunMainApp.class, args);
	}
	
	@Bean
	ApplicationRunner init(CarRepository repository)
	{
		return args -> {
            Stream.of("Ferrari", "Jaguar", "Porsche", "Lamborghini", "Bugatti",
                      "AMC Gremlin", "Triumph Stag", "Ford Pinto", "Yugo GV").forEach(name -> {
                Car car = new Car();
                car.setName(name);
                repository.save(car);
            });
            repository.findAll().forEach(System.out::println);
		};
	}

}
