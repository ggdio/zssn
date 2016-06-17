package br.com.ggdio.zssn.domain.infection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.ggdio.zssn.domain.survivor.Survivor;

@Service
public class InfectionFactory {
	
	private final InfectionRepository repository;
	
	@Autowired
	public InfectionFactory(InfectionRepository repository) {
		this.repository = repository;
	}

	public Infection getInfectionInstance(Survivor victim) {
		if(victim == null) return null;
		
		Infection infection = repository.findByVictim(victim.getId());
		return infection != null ? infection : new DefaultInfection();
	}
	
}
