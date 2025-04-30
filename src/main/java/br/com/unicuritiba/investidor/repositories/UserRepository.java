package br.com.unicuritiba.investidor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.investidor.models.User;

public interface UserRepository
		extends JpaRepository<User , Long>{
	
	
	
}