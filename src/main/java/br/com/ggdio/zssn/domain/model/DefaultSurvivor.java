package br.com.ggdio.zssn.domain.model;

import br.com.ggdio.zssn.domain.enumeration.Status;
import br.com.ggdio.zssn.shared.Person;

public class DefaultSurvivor extends Survivor {
	
	protected DefaultSurvivor(Person person) {
		super(person);
	}
	
	@Override
	public boolean isInfected() {
		return Status.INFECTED.equals(getStatus());
	}

	@Override
	public void becomeZombie() {
		setStatus(Status.INFECTED);
	}

}