package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/jobs")
@CrossOrigin(origins="http://localhost:4200")

public class JobsController {
	
	@Autowired
	JobsRepository jobsRepository;
	
	@GetMapping()
	public ResponseEntity<List<Job>> getJob(){
		return ResponseEntity.ok(jobsRepository.findAll());
		
}
	@PostMapping()
	public ResponseEntity<Void> addJob(@RequestBody Job job) {
		jobsRepository.save(job);
		return ResponseEntity.ok().build();
		
	}
	@DeleteMapping("/{id}")
	public void deleteJob(@PathVariable int id) {
		jobsRepository.deleteById(id);
	}

}
