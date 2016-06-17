package br.com.ggdio.zssn.domain.shared;

import java.util.List;

import br.com.ggdio.zssn.domain.survivor.Survivor;

public interface SurvivorRepository {
	
	public List<Survivor> findAll();
	
	public void store(Survivor person);

	public Survivor findOne(Long id);
	
}
