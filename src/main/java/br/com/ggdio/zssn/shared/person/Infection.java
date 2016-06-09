package br.com.ggdio.zssn.shared.person;

/**
 * Infection Report
 * A person may be infected, so other survivors may report it
 * @author Dio
 *
 */
@SuppressWarnings("unused")
public abstract class Infection {

	private Long id;
	private Person victim;
	private Person firstReporter;
	private Person secondReporter;
	private Person thirdReporter;
	
	protected abstract Long getId();
	protected abstract Person getVictim();
	protected abstract Person getFirstReporter();
	protected abstract Person getSecondReporter();
	protected abstract Person getThirdReporter();
	
	protected abstract void setId(Long id);
	protected abstract void setVictim(Person person);
	protected abstract void setFirstReporter(Person firstReporter);
	protected abstract void setSecondReporter(Person secondReporter);
	protected abstract void setThirdReporter(Person thirdReporter);
	
}