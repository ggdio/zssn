package br.com.ggdio.zssn.domain.repository;

import java.util.List;

import br.com.ggdio.zssn.domain.model.Person;

public interface SurvivorRepository {
	
	public List<Person> findAll();
	
	public void store(Person person);
	
}
