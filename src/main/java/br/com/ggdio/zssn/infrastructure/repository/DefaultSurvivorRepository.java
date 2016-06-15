package br.com.ggdio.zssn.infrastructure.repository;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import br.com.ggdio.zssn.domain.model.Person;
import br.com.ggdio.zssn.domain.repository.SurvivorRepository;

@Named
public class DefaultSurvivorRepository implements SurvivorRepository {
	
	private final EntityManagerFactory emf;
	
	@Inject
	public DefaultSurvivorRepository(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public List<Person> findAll() {
		EntityManager em = emf.createEntityManager();
		List<Person> result = em.createQuery("from Person").getResultList();
		em.close();
		
		return result;
	}
	
	@Override
	public void store(Person person) {
		
	}
	
	
}