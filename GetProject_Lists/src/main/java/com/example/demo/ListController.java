package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//tell spring that this will handle requests
@RestController
public class ListController {
	//simple array
	private String[] myArray = {"apple", "mine", "sloth", "pizza", "sandwich", "pineapple"};
	
	//array list
	//an array list is  a list
	private List<String> myArrayList = new ArrayList<String>();
	
	
	public ListController() {
	myArrayList.add("giraffe");
	myArrayList.add("elephant");
	myArrayList.add("dog");
	myArrayList.add("sphinx");
	myArrayList.add("wolf");
	myArrayList.add("cougar");
	
	}
	//make a method to get the whole array back
	@GetMapping("/array")
	public String[] getArray() {
		return this.myArray;
	}
	
	//get an item out of the array by its index
	//index is an integer(number), therefore after the @pathvariable you will see
	//int index.  In postman you will locate the array item by typing
	//localhost:8080/array/0 or 1 or 2,  etc.
	@GetMapping("/array/{index}")
	public String getArrayList(@PathVariable int index) {
		return myArray[index];
		
	}	
	//get the whole list
	@GetMapping("/list")
	public List<String> getList(){
		return this.myArrayList;
	}
	//get an item individually out of the arraylist by its index
	@GetMapping("/list/{index}")
	public String getListItem(@PathVariable int index) {
		return myArrayList.get(index);
	}
}
