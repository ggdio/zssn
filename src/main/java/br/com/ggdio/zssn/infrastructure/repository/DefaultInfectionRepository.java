package br.com.ggdio.zssn.infrastructure.repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import br.com.ggdio.zssn.domain.infection.Infection;
import br.com.ggdio.zssn.domain.infection.InfectionRepository;

@Repository
public class DefaultInfectionRepository implements InfectionRepository {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Infection findByVictim(Long victimId) {
		TypedQuery<Infection> query = em.createQuery("FROM Infection i where i.victim.id = :victimId", Infection.class);
		query.setParameter("victimId", victimId);
		
		try {
			return query.getSingleResult();
			
		} catch(NoResultException e) {
			return null;
			
		}
	}

	@Override
	public void store(Infection infection) {
		em.persist(infection);
	}

}
