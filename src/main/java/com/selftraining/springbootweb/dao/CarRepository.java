package com.selftraining.springbootweb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.selftraining.springbootweb.model.Car;

//@RepositoryRestResource (path = "carrep")
@CrossOrigin( origins = "http://localhost:4200")
public interface CarRepository extends JpaRepository<Car, Long> {

}
