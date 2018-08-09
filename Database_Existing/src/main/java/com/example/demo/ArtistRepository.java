package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//we will add an attribute to signify that this will talk to the database
@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer>{

}
