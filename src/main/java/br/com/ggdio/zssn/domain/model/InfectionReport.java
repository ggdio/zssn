package br.com.ggdio.zssn.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class InfectionReport {
	
	@Id @GeneratedValue
	private Long id;

	@OneToOne @Column(nullable=false)
	private Person person;
	
	@ManyToOne @Column(nullable=false)
	private Person firstReporter;
	
	@ManyToOne
	private Person secondReporter;
	
	@ManyToOne
	private Person thirdReporter;
	
	public InfectionReport() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public Person getPerson() {
		return person;
	}

	public Person getFirstReporter() {
		return firstReporter;
	}

	public Person getSecondReporter() {
		return secondReporter;
	}

	public Person getThirdReporter() {
		return thirdReporter;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public void setFirstReporter(Person firstReporter) {
		this.firstReporter = firstReporter;
	}

	public void setSecondReporter(Person secondReporter) {
		this.secondReporter = secondReporter;
	}

	public void setThirdReporter(Person thirdReporter) {
		this.thirdReporter = thirdReporter;
	}
	
}
