package br.com.ggdio.zssn.application.rest.resource;

import java.time.LocalDate;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ggdio.zssn.domain.enumeration.Gender;
import br.com.ggdio.zssn.domain.enumeration.Status;
import br.com.ggdio.zssn.domain.model.Location;
import br.com.ggdio.zssn.domain.model.Person;
import br.com.ggdio.zssn.domain.repository.SurvivorRepository;

@Path("/survivors")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SurvivorResource {
	
	private final SurvivorRepository repo;
	
	@Autowired
	public SurvivorResource(SurvivorRepository repo) {
		this.repo = repo;
		Person person = new Person();
		person.setName("Guilherme Dio");
		person.setBirthday(LocalDate.of(1992, 11, 27));
		person.setGender(Gender.MALE);
		person.setStatus(Status.ALIVE);
		person.setLocation(new Location(10.02002, 7.29911));
		repo.store(person);
		
		System.out.println(repo);
	}

	@GET
	@Path("/")
	public Response findAll() {
		return Response.ok(repo.findAll()).build();
	}
	
	
}