package br.com.ggdio.zssn.application.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ggdio.zssn.domain.repository.SurvivorRepository;

@Path("/survivors")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SurvivorResource {
	
	private final SurvivorRepository repo;
	
	@Autowired
	public SurvivorResource(SurvivorRepository repo) {
		this.repo = repo;
	}
	
	
}