package com.example.demo.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coffee")
@CrossOrigin(origins="http://localhost:4200")

public class CoffeeController {

	
	
	
	
		
	//need a reference to repository
	@Autowired
	CoffeeRepository coffeeRepository;
	
	// get all coffee objects
	@GetMapping()
	public ResponseEntity<List<Coffee>> getCoffee(){
		return ResponseEntity.ok(coffeeRepository.findAll());
		
	}
	//add a coffee object
	@PostMapping()
	public ResponseEntity<Void> addCoffee(@RequestBody Coffee coffee) {
		coffeeRepository.save(coffee);
		return ResponseEntity.ok().build();
		
	}

}
