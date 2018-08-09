package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//tell spring that we can listen to requests
@RestController
public class ObjectController {
	//we are going to make a new thingy
	private Thingy thing;
	
	@PostMapping("/thing")
	public Thingy newThingy(@RequestBody Thingy thing) {
		this.thing = thing;
		return this.thing;
	}

}

class Thingy {
	
	private int id;
	private String name;
	private boolean wobbles;
	
	//get getters and setters fast by right clicking on the page click source and
	// click generate getters and setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isWobbles() {
		return wobbles;
	}
	public void setWobbles(boolean wobbles) {
		this.wobbles = wobbles;
	}
	
}
