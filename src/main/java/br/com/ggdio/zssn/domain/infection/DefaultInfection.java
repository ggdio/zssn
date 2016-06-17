package br.com.ggdio.zssn.domain.infection;

import br.com.ggdio.zssn.domain.survivor.Survivor;

class DefaultInfection implements Infection {

	private final Long id;
	
	private final Survivor victim;
	private final Survivor firstReporter;
	private Survivor secondReporter;
	private Survivor thirdReporter;
	
	DefaultInfection() {
		this.id = null;
		this.victim = null;
		this.firstReporter = null;
	}
	
	public DefaultInfection(Survivor victim, Survivor reporter) {
		this.id = null;
		this.victim = victim;
		this.firstReporter = reporter;
	}
	
	@Override
	public Long getId() {
		return id;
	}
	
	@Override
	public Survivor getVictim() {
		return victim;
	}
	
	@Override
	public Survivor getFirstReporter() {
		return firstReporter;
	}
	
	@Override
	public Survivor getSecondReporter() {
		return secondReporter;
	}
	
	@Override
	public Survivor getThirdReporter() {
		return thirdReporter;
	}
	
	@Override
	public void reportInfection(Survivor reporter) {
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