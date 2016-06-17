package br.com.ggdio.zssn.domain.infection;

import br.com.ggdio.zssn.domain.survivor.Survivor;

/**
 * Infection Report
 * A person may be infected, so other survivors may report it
 * @author Dio
 *
 */
public interface Infection {

	public Long getId();
	
	public Survivor getVictim();
	
	public Survivor getFirstReporter();
	
	public Survivor getSecondReporter();
	
	public Survivor getThirdReporter();
	
	/**
	 * Report an infection occurrence.
	 * <p> Three different reporters are necessary to flag a survivor as infected
	 * @param reporter
	 */
	public void reportInfection(Survivor reporter);
	
}