package br.com.ggdio.zssn.domain.model;

import java.time.LocalDate;
import java.util.Set;

import br.com.ggdio.zssn.domain.enumeration.Gender;
import br.com.ggdio.zssn.domain.enumeration.Status;

public class Person {
	
	private final Long id;
	private String name;
	private LocalDate birthday;
	private Gender gender;
	private Status status;
	private Location location;
	private Set<Item> items;
	
	protected Person() {
		this.id = null;
	}
	
	public Person(String name, Gender gender, Location location) {
		this(name, gender, location, null);
	}
	
	public Person(String name, Gender gender, Location location, Set<Item> items) {
		this.id = null;
		this.name = name;
		this.gender = gender;
		this.location = location;
		this.location = location;
		this.items = items;
		
		// A person is alive upon registering
		this.status = Status.ALIVE;
	}
	
	public Long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public int getCurrentAge() {
		return birthday.with(LocalDate.now()).getYear();
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
	
	public Location getCurrentLocation() {
		return location;
	}
	
	public Set<Item> getInventoryItems() {
		return items;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	public void becomeZombie() {
		if(id != null && isAlive()) {
			this.status = Status.INFECTED;
		}
	}
	
	public void becomeDead() {
		if(id != null && isZombie()) {
			this.status = Status.DECEASED;
		}
	}
	
	public void reallocate(double latitude, double longitude) {
		this.location = new Location(latitude, longitude);
	}
	
}