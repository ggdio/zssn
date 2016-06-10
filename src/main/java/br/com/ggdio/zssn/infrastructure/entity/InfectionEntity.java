package br.com.ggdio.zssn.infrastructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.com.ggdio.zssn.shared.Infection;
import br.com.ggdio.zssn.shared.InfectionDecorator;
import br.com.ggdio.zssn.shared.Person;
import br.com.ggdio.zssn.util.CharacterUtil;

@Entity
@Table(name="INFECTION")
public class InfectionEntity extends InfectionDecorator {
	
	private Boolean infected;

	public InfectionEntity(Infection infection) {
		super(infection);
	}

	@Override
	@Column(name="ID_INFECTION")
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	protected Long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	@OneToOne @Column(name="ID_VICTIM", nullable=false)
	protected Person getVictim() {
		// TODO Auto-generated method stub
		return super.getVictim();
	}

	@Override
	@ManyToOne @Column(name="ID_FIRSTREPORTER", nullable=false)
	protected Person getFirstReporter() {
		// TODO Auto-generated method stub
		return super.getFirstReporter();
	}

	@Override
	@ManyToOne @Column(name="ID_SECONDREPORTER")
	protected Person getSecondReporter() {
		// TODO Auto-generated method stub
		return super.getSecondReporter();
	}

	@Override
	@ManyToOne @Column(name="ID_THIRDREPORTER")
	protected Person getThirdReporter() {
		// TODO Auto-generated method stub
		return super.getThirdReporter();
	}
	
	@Column(name="DO_INFECTED", length=1)
	protected Character getInfected() {
		return CharacterUtil.getBoolean(isInfected());
	}
	
	public Boolean isInfected() {
		return infected;
	}
	
	public void setInfected(Boolean infected) {
		this.infected = infected;
	}

}