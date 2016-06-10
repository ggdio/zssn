package br.com.ggdio.zssn.infrastructure.repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.ggdio.zssn.infrastructure.data.PersonData;
import br.com.ggdio.zssn.shared.Person;

public class PersonRepository {
	
	public Person get(Long id) {
		for (PersonData person : personBucket)
			if(person.getId().equals(id)) return person;
		return null;
	}
	
	private static List<PersonData> personBucket = new ArrayList<>();
	{
		personBucket.addAll(Arrays.asList(
				new PersonData(1l, "Rick Grimes", LocalDate.of(1963, 4, 16), null, null, null, null),
				new PersonData(1l, "Carl Grimes", LocalDate.of(1994, 10, 9), null, null, null, null)
		));
	}
	
}