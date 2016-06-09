package br.com.ggdio.zssn.domain.model;

import java.time.LocalDate;
import java.util.Set;

import br.com.ggdio.zssn.domain.enumeration.Gender;
import br.com.ggdio.zssn.shared.inventory.Item;
import br.com.ggdio.zssn.shared.person.Person;
import br.com.ggdio.zssn.shared.person.PersonDecorator;

public abstract class Survivor extends PersonDecorator {
	
	private LastLocation lastLocation;

	protected Survivor(Person person) {
		super(person);
		
		lastLocation = new LastLocation(getLocation());
	}
	
	@Override
	public String getName() {
		return super.getName();
	}
	
	@Override
	public LocalDate getBirthday() {
		return super.getBirthday();
	}
	
	public Gender getGender() {
		return (Gender) super.getGender();
	}
	
	public LastLocation getLastLocation() {
		return lastLocation;
	}
	
	public Set<Item> getInventoryItems() {
		return super.getItems();
	}
	
	public abstract boolean isInfected();
	public abstract void becomeZombie();
	
}