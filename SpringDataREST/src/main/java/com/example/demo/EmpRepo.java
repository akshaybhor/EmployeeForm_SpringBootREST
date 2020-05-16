package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Alien;

@RepositoryRestResource(collectionResourceRel = "aliens" ,path="aliens")
public interface EmpRepo extends JpaRepository<Alien, Integer> {
	
		

}
