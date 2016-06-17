package br.com.ggdio.zssn.domain.survivor;

import java.util.Set;

import br.com.ggdio.zssn.domain.enumeration.Gender;
import br.com.ggdio.zssn.domain.enumeration.Status;

public class Survivor {
	
	protected final Long id;
	protected String name;
	protected int age;
	protected Gender gender;
	protected Status status;
	protected Location location;
	protected Set<Item> items;
	
	protected Survivor() {
		this.id = null;
	}
	
	public Survivor(String name, Gender gender, Location location, Set<Item> items) {
		this.id = null;
		this.name = name;
		this.gender = gender;
		this.location = location;
		this.location = location;
		this.items = items;
		
		// A survivor is alive by default
		this.status = Status.ALIVE;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public boolean isAlive() {
		return this.status == Status.ALIVE;
	}
	
	public boolean isZombie() {
		return this.status == Status.INFECTED;
	}
	
	public Location getLastLocation() {
		return location;
	}
	
	public Set<Item> getInventoryItems() {
		return items;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void becomeZombie() {
		if(id != null && isAlive()) {
			this.status = Status.INFECTED;
		}
	}
	
	public void reallocate(double latitude, double longitude) {
		this.location = new Location(latitude, longitude);
	}
	
}