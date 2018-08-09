package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//step 1.  Tell spring that this will accept requests by adding restcontroller
@RestController
public class VariableController {
	
	//private variables
	//String is capitalized because it is a class
	//private means that only the variable controller  has access to it
	private String myName = "Angela";
	private int myNumber = 52;
	private boolean isSmart = true;
	private double  salary = 50.00 ;
	private float gpa = 3.8f;
   
	
	
	
	//listen to an incoming GET request at the specified path
	@GetMapping("/name")
	public String getName() {
		//using this. is similar to saying me
		return this.myName;
	}
	@GetMapping("/number")
	public int getNumber() {
		return this.myNumber;
	}
	@GetMapping("/issmart")
	public boolean getIsSmart() {
		if(isSmart!=false) {
				
		}
		return isSmart;
	}
	@GetMapping("/salary")
	public double getSalary() {
		return this.salary;
	}
	@GetMapping("/gpa")
	public float getGpa() {
		return this.gpa;
	}
	
}
