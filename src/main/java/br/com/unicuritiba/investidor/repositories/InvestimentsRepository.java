package br.com.unicuritiba.investidor.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unicuritiba.investidor.models.Investiments;

public interface InvestimentsRepository
		extends JpaRepository<Investiments, Long>{
	
	
	
}