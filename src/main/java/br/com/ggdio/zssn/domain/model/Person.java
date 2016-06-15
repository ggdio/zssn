package br.com.ggdio.zssn.domain.model;

import java.time.LocalDate;
import java.util.Set;

import br.com.ggdio.zssn.domain.enumeration.Gender;
import br.com.ggdio.zssn.domain.enumeration.Status;

public class Person {
	
	private Long id;
	private String name;
	private LocalDate birthday;
	private Gender gender;
	private Status status;
	private Location location;
	private Set<Item> items;
	
	public Person() {
		// TODO Auto-generated constructor stub
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
	
	public Gender getGender() {
		return gender;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public Set<Item> getItems() {
		return items;
	}
	
	public void setId(Long id) {
		this.id = id;
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
	
	public void setStatus(Status status) {
		this.status = status;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void setItems(Set<Item> items) {
		this.items = items;
	}

}