package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//tell spring we can listen to requests
@RestController
public class ListController {
	
	private List<String> sandwiches = new ArrayList<String>();
	
	public ListController () {
		sandwiches.add("blta");
		sandwiches.add("italian bmt");
		sandwiches.add("smores");
		sandwiches.add("mcdonalds");
		sandwiches.add("roast beef");
		sandwiches.add("tuna");
		sandwiches.add("muffaleta");
	}
	//this will update an item with the new value and then give you what was there
	//when you check it in Postman
	@PutMapping("/sandwich/{index}")
	public String updateSandwich(@PathVariable int index, @RequestBody String sandwich) {
		return sandwiches.set(index, sandwich);
	}
}
