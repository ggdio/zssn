package br.com.ggdio.zssn.shared.person;

import java.time.LocalDate;
import java.util.Set;

import br.com.ggdio.zssn.shared.UniqueKey;
import br.com.ggdio.zssn.shared.inventory.Item;
import br.com.ggdio.zssn.shared.position.Location;

public class DefaultPerson extends Person {
	
	public DefaultPerson() {
		// TODO Auto-generated constructor stub
	}
	
	public DefaultPerson(Long id, String name, LocalDate birthday, UniqueKey gender, UniqueKey status, Location location, Set<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.birthday = birthday;
		this.gender = gender;
		this.status = status;
		this.location = location;
		this.items = items;
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
	
	public UniqueKey getGender() {
		return gender;
	}
	
	public UniqueKey getStatus() {
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
	
	public void setGender(UniqueKey gender) {
		this.gender = gender;
	}
	
	public void setStatus(UniqueKey status) {
		this.status = status;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	
}