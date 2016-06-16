package br.com.ggdio.zssn.domain.infection;

import br.com.ggdio.zssn.domain.model.Person;

class DefaultInfection implements Infection {

	private final Long id;
	
	private final Person victim;
	private final Person firstReporter;
	private Person secondReporter;
	private Person thirdReporter;
	
	DefaultInfection() {
		this.id = null;
		this.victim = null;
		this.firstReporter = null;
	}
	
	public DefaultInfection(Person victim, Person reporter) {
		this.id = null;
		this.victim = victim;
		this.firstReporter = reporter;
	}
	
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public Person getVictim() {
		return victim;
	}
	
	@Override
	public Person getFirstReporter() {
		return firstReporter;
	}
	
	@Override
	public Person getSecondReporter() {
		return secondReporter;
	}
	
	@Override
	public Person getThirdReporter() {
		return thirdReporter;
	}
	
	@Override
	public void reportInfection(Person reporter) {
		if(this.secondReporter == null) {
			if(!firstReporter.equals(reporter)) {
				this.secondReporter = reporter;
			}
		} else {
			if(!secondReporter.equals(reporter)) {
				this.thirdReporter = reporter;
			}
		}
	}
	
}