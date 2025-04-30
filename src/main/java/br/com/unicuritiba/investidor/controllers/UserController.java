package br.com.unicuritiba.investidor.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicuritiba.investidor.models.User;
import br.com.unicuritiba.investidor.repositories.UserRepository;


@RestController
public class UserController {
	@Autowired
	UserRepository repository;

	@GetMapping("/user")
	public ResponseEntity<List<User>> getUser() {
		return ResponseEntity.ok(repository.findAll());
	}

	@GetMapping("/user/id")
	public ResponseEntity<User> getUser(@PathVariable long id) {
		return ResponseEntity.ok(repository.findById(id).get());
	}

	@PostMapping("/user")
	public ResponseEntity<User> SaveUser(@RequestBody User user) {
		User savedUser = repository.save(user);
		return ResponseEntity.ok(savedUser);
	}

	@DeleteMapping("/user{id}")
	public void removieUser(@PathVariable long id) {
		repository.deleteById(id);

	}

	@PutMapping("/user/{id}")
	public ResponseEntity<User> updateUser(@PathVariable long id, @RequestBody User user) {
		user.setId(id);
		User savedUser = repository.save(user);
		return ResponseEntity.ok(savedUser);

	}
}

