package com.projetoweb.democarlos.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetoweb.democarlos.entities.User;

@RestController
@RequestMapping (value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Carlos", "CarlosChaves@gamil.com", "989965899", "2323232323");
		return ResponseEntity.ok().body(u);

	}
}
