package br.com.ggdio.zssn.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ggdio.zssn.domain.shared.SurvivorRepository;
import br.com.ggdio.zssn.domain.survivor.Survivor;

@Repository
public class DefaultSurvivorRepository implements SurvivorRepository {
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<Survivor> findAll() {
		return em.createQuery("from " + Survivor.class.getSimpleName(), Survivor.class).getResultList();
	}
	
	@Override
	@Transactional
	public void store(Survivor person) {
		em.persist(person);
	}
	
	@Override
	public Survivor findOne(Long id) {
		return em.find(Survivor.class, id);
	}
	
}