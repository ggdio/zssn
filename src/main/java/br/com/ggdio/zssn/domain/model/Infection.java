package br.com.ggdio.zssn.domain.model;

/**
 * Infection Report
 * A person may be infected, so other survivors may report it
 * @author Dio
 *
 */
public class Infection {

	private Long id;
	private Person victim;
	private Person firstReporter;
	private Person secondReporter;
	private Person thirdReporter;
	
	public Infection() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	
	public Person getVictim() {
		return victim;
	}
	
	public Person getFirstReporter() {
		return firstReporter;
	}
	
	public Person getSecondReporter() {
		return secondReporter;
	
	}
	
	public Person getThirdReporter() {
		return thirdReporter;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setVictim(Person victim) {
		this.victim = victim;
	}
	
	public void setFirstReporter(Person firstReporter) {
		this.firstReporter = firstReporter;
	}
	
	public void setSecondReporter(Person secondReporter) {
		this.secondReporter = secondReporter;
	}
	
	public void setThirdReporter(Person thirdReporter) {
		this.thirdReporter = thirdReporter;
	}
	
}