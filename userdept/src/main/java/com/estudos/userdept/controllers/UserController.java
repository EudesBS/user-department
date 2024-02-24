package com.estudos.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudos.userdept.entities.User;
import com.estudos.userdept.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController  {
	
	@Autowired
	private UserRepository repository;

	@GetMapping
	public ResponseEntity<List<User>> findAll(){
		List<User> userList = repository.findAll();
		return ResponseEntity.ok(userList);
		
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User userById = repository.findById(id).get();
		return ResponseEntity.ok(userById);
	}
	
	@PostMapping
	public ResponseEntity<User> insertUser(@RequestBody User user){
		User newUser = repository.save(user);
		return ResponseEntity.ok(newUser);
	}

}
