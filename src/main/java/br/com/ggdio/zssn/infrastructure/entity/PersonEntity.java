package br.com.ggdio.zssn.infrastructure.entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.com.ggdio.zssn.infrastructure.entity.util.EntityUtil;
import br.com.ggdio.zssn.shared.person.Person;
import br.com.ggdio.zssn.shared.person.PersonDecorator;

@Entity
@Table(name="PERSON")
public class PersonEntity extends PersonDecorator {

	public PersonEntity(Person person) {
		super(person);
	}

	@Override
	@Column(name="ID_PERSON")
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	@Column(name="DS_NAME", nullable=false)
	protected String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	@Column(name="DT_BIRTH", nullable=false)
	protected LocalDate getBirthday() {
		// TODO Auto-generated method stub
		return super.getBirthday();
	}

	@Column(name="DO_GENDER", nullable=false)
	protected Character getGenderType() {
		return EntityUtil.getUniqueChar(super.getGender());
	}

	@Column(name="DO_STATUS", length=1, nullable=false)
	protected Character getStatusType() {
		return EntityUtil.getUniqueChar(super.getStatus());
	}

	@Override
	protected LocationEmbeddable getLocation() {
		return new LocationEmbeddable(super.getLocation());
	}

	@OneToMany @JoinColumn(name="ID_PERSON")
	protected Set<ItemEntity> getPersonItems() {
		Set<ItemEntity> items = new HashSet<>();
		super.getItems().forEach(i -> items.add(new ItemEntity(i)));
		return items;
	}
	
}