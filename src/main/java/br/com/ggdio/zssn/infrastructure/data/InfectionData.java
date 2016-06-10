package br.com.ggdio.zssn.infrastructure.data;

import br.com.ggdio.zssn.shared.Infection;
import br.com.ggdio.zssn.shared.Person;

public class InfectionData extends Infection {
	
	public InfectionData() {
		// TODO Auto-generated constructor stub
	}
	
	public InfectionData(Long id, Person victim, Person firstReporter, Person secondReporter, Person thirdReporter) {
		super();
		this.id = id;
		this.victim = victim;
		this.firstReporter = firstReporter;
		this.secondReporter = secondReporter;
		this.thirdReporter = thirdReporter;
	}

	@Override
	protected Long getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Person getVictim() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Person getFirstReporter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Person getSecondReporter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Person getThirdReporter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected void setId(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setVictim(Person person) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setFirstReporter(Person firstReporter) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setSecondReporter(Person secondReporter) {
		// TODO Auto-generated method stub

	}

	@Override
	protected void setThirdReporter(Person thirdReporter) {
		// TODO Auto-generated method stub

	}

}
