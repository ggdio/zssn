package br.com.ggdio.zssn.infrastructure.repository;

import br.com.ggdio.zssn.infrastructure.entity.PersonEntity;
import br.com.ggdio.zssn.shared.person.DefaultPerson;
import br.com.ggdio.zssn.shared.person.Person;

public class PersonRepository {

	public void save(Person person) {
		System.out.println(new PersonEntity(person));
	}
	
	public Person get(Long id) {
		DefaultPerson defaultPerson = new DefaultPerson();
		defaultPerson.setId(id);
		return defaultPerson;
	}
	
}