package br.com.ggdio.zssn.domain.infection;

import br.com.ggdio.zssn.domain.model.Person;

/**
 * Infection Report
 * A person may be infected, so other survivors may report it
 * @author Dio
 *
 */
public interface Infection {

	public Long getId();
	
	public Person getVictim();
	
	public Person getFirstReporter();
	
	public Person getSecondReporter();
	
	public Person getThirdReporter();
	
	/**
	 * Report an infection occurrence.
	 * <p> Three different reporters are necessary to flag a survivor as infected
	 * @param reporter
	 */
	public void reportInfection(Person reporter);
	
}