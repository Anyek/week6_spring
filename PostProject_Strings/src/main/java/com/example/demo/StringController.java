package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//tell spring we are going to listen to requests
@RestController
public class StringController {
	
	private String sentence = "";
	
	//this is how you add a word to the sentence one word at a time
	
	@PostMapping("/sentence/{word}")
	public String addWord(@PathVariable String word) {
		this.sentence += word + " ";
		return sentence;
	}
	
	//if you want to overwrite the whole sentence do the following
	
	@PostMapping("/sentence/overwrite/{word}")
	public String overwriteWord(@PathVariable String word) {
	this.sentence = word;
	return sentence;
}
	//add a word to the sentence using request body
	@PostMapping("/sentence")
	public String addWordFromBody(@RequestBody String word) {
	this.sentence += word + " ";
	return sentence;
}
	// overwriting will replace what is already there
	@PostMapping("/sentence/overwrite")
	public String overwriteWordFromBody(@RequestBody String word) {
		this.sentence = word;
		return sentence;
	}
	
}
