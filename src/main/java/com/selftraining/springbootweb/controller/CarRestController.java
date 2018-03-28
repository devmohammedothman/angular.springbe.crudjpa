package com.selftraining.springbootweb.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.selftraining.springbootweb.dao.CarRepository;
import com.selftraining.springbootweb.model.Car;

@RestController
@CrossOrigin( origins = "http://localhost:4200")
public class CarRestController {

	private CarRepository carRepo;
	
	public CarRestController(CarRepository repository)
	{
		//check if it will reflect on git ui
		this.carRepo = repository;
	}
	
	@GetMapping("/cool-cars")
	@CrossOrigin(origins = "http://localhost:4200")
	public Collection<Car> coolCars()
	{
		return carRepo.findAll().stream().collect(Collectors.toList());
	}
}
