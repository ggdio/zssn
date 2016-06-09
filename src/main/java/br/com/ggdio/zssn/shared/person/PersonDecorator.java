package br.com.ggdio.zssn.shared.person;

import java.time.LocalDate;
import java.util.Set;

import br.com.ggdio.zssn.shared.UniqueKey;
import br.com.ggdio.zssn.shared.inventory.Item;
import br.com.ggdio.zssn.shared.position.Location;

/**
 * Decorator Wrapper for Person
 * @author Dio
 *
 */
public abstract class PersonDecorator extends Person {
	
	private final Person person;
	
	protected PersonDecorator(Person person) {
		this.person = person;
	}

	@Override
	protected Long getId() {
		return person.getId();
	}

	@Override
	protected String getName() {
		return person.getName();
	}

	@Override
	protected LocalDate getBirthday() {
		return person.getBirthday();
	}

	@Override
	protected UniqueKey getGender() {
		return person.getGender();
	}

	@Override
	protected UniqueKey getStatus() {
		return person.getStatus();
	}

	@Override
	protected Location getLocation() {
		return person.getLocation();
	}

	@Override
	protected Set<Item> getItems() {
		return person.getItems();
	}
	
	@Override
	protected void setId(Long id) {
		person.setId(id);
	}

	@Override
	protected void setName(String name) {
		person.setName(name);
	}

	@Override
	protected void setBirthday(LocalDate birthday) {
		person.setBirthday(birthday);
	}

	@Override
	protected void setGender(UniqueKey gender) {
		person.setGender(gender);
	}

	@Override
	protected void setStatus(UniqueKey status) {
		person.setStatus(status);
	}

	@Override
	protected void setLocation(Location location) {
		person.setLocation(location);
	}

	@Override
	protected void setItems(Set<Item> items) {
		person.setItems(items);
	}

}