package br.com.ggdio.zssn.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ggdio.zssn.domain.model.Person;
import br.com.ggdio.zssn.domain.repository.SurvivorRepository;

@Repository
public class DefaultSurvivorRepository implements SurvivorRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Person> findAll() {
		List<Person> result = em.createQuery("from Person", Person.class).getResultList();
		return result;
	}
	
	@Override
	@Transactional
	public void store(Person person) {
		em.persist(person);
	}
	
	
}