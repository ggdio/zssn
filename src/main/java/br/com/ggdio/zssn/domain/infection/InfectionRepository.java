package br.com.ggdio.zssn.domain.infection;

/**
 * Repository interface for Infection reports
 * @author Dio
 *
 */
public interface InfectionRepository {
	
	public Infection findByVictim(Long victimId);
	
	public void store(Infection infection);

}
