package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArtistController {
	
	//make a reference to the repository
	//artistRepository is the object to use. 
	@Autowired
	ArtistRepository artistRepository;
	
	//get our list of artists
	@GetMapping("/artists")
	public List<Artist> getArtists(){
		return artistRepository.findAll();
	}
}
