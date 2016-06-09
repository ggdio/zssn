package br.com.ggdio.zssn.shared.person;

import java.time.LocalDate;
import java.util.Set;

import br.com.ggdio.zssn.domain.enumeration.Gender;
import br.com.ggdio.zssn.domain.enumeration.Status;
import br.com.ggdio.zssn.shared.UniqueKey;
import br.com.ggdio.zssn.shared.inventory.Item;
import br.com.ggdio.zssn.shared.position.Location;

@SuppressWarnings("unused")
public abstract class Person {
	
	protected Long id;
	protected String name;
	protected LocalDate birthday;
	protected UniqueKey gender;
	protected UniqueKey status;
	protected Location location;
	protected Set<Item> items;

	protected abstract Long getId();
	protected abstract String getName();
	protected abstract LocalDate getBirthday();
	protected abstract UniqueKey getGender();
	protected abstract UniqueKey getStatus();
	protected abstract Location getLocation();
	protected abstract Set<Item> getItems();

	protected abstract void setId(Long id);
	protected abstract void setName(String name);
	protected abstract void setBirthday(LocalDate birthday);
	protected abstract void setGender(UniqueKey gender);
	protected abstract void setStatus(UniqueKey status);
	protected abstract void setLocation(Location location);
	protected abstract void setItems(Set<Item> items);

}