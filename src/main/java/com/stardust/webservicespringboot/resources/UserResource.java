package com.stardust.webservicespringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stardust.webservicespringboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		
		User u = new User(1L, "David", "david@gmail.com", "1186506865", "123456");
		return ResponseEntity.ok().body(u);
		
	}

}
