package br.com.ggdio.zssn.domain.model;

import java.time.LocalDate;

import javax.persistence.Entity;

import br.com.ggdio.zssn.domain.enumeration.Gender;
import br.com.ggdio.zssn.domain.enumeration.Status;

@Entity
public class Person {
	
	private String name;
	private LocalDate birthday;
	private Gender gender;
	private Status status;
	private Location location;
	
	public Person() {
		this.status = Status.ALIVE;
	}

}
