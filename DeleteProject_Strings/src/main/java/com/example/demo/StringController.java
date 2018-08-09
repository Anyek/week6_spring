package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//tell spring that we will listen to requests
@RestController
public class StringController {
	
	private List<String> colors = new ArrayList<String>();
	
	public StringController() {
		colors.add("Blue");
		colors.add("Green");
		colors.add("Purple");
		colors.add("Gold");
		colors.add("Silver");
		colors.add("Grue");
	}
	//to remove a color. We set this as a boolean to show some kind of indication
	//in postman that the color was deleted or not.  if unable to delete because item
	//is not found then false will be returned
	@DeleteMapping("/color/{index}")
	public boolean removeColor(@PathVariable int index) {
		try {
			this.colors.remove(index);
			return true;
		} catch (IndexOutOfBoundsException ex) {
			return false;
		}
	}
}

