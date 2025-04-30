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

import br.com.unicuritiba.investidor.models.Investiments;
import br.com.unicuritiba.investidor.repositories.InvestimentsRepository;
@RestController
public class InvestimentsController {
	@Autowired
	InvestimentsRepository repository;
	
	@GetMapping("/investiment")
	public ResponseEntity<List<Investiments>> getInvestiment() {
		return ResponseEntity.ok(repository.findAll());
	}
	@GetMapping("/investiment/id")
	public ResponseEntity<Investiments> getInvestiment(@PathVariable long id) {
		return ResponseEntity.ok(repository.findById(id).get());
	}
	@PostMapping("/investiment")
	public ResponseEntity<Investiments> SaveInvestiment(@RequestBody Investiments investiment) {
		Investiments savedInvestiment = repository.save(investiment);
		return ResponseEntity.ok(savedInvestiment);
	}
	@DeleteMapping("/investiment{id}")
	public void removieinvestiment(@PathVariable long id) {
		repository.deleteById(id);

	}
	@PutMapping("/investiment/{id}")
	public ResponseEntity<Investiments> updateInvestiment(@PathVariable long id, @RequestBody Investiments investiments) {
		investiments.setId(id);
		Investiments savedInvestiment = repository.save(investiments);
		return ResponseEntity.ok(savedInvestiment);

}
}

