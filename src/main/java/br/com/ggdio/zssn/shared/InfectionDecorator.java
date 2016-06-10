package br.com.ggdio.zssn.shared;

public abstract class InfectionDecorator extends Infection {
	
	private final Infection infection;	

	public InfectionDecorator(Infection infection) {
		this.infection = infection;
	}

	@Override
	protected Long getId() {
		return infection.getId();
	}

	@Override
	protected Person getVictim() {
		return infection.getVictim();
	}

	@Override
	protected Person getFirstReporter() {
		return infection.getFirstReporter();
	}

	@Override
	protected Person getSecondReporter() {
		return infection.getSecondReporter();
	}

	@Override
	protected Person getThirdReporter() {
		return infection.getThirdReporter();
	}

	@Override
	protected void setId(Long id) {
		infection.setId(id);
	}

	@Override
	protected void setVictim(Person person) {
		infection.setVictim(person);
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
