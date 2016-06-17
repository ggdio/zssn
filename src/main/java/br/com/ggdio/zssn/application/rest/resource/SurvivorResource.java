package br.com.ggdio.zssn.application.rest.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.ggdio.zssn.application.view.SurvivorModel;
import br.com.ggdio.zssn.domain.shared.SurvivorRepository;
import br.com.ggdio.zssn.domain.survivor.Survivor;

@Path("/survivors")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class SurvivorResource {
	
	private final SurvivorRepository repo;
	
	@Autowired
	public SurvivorResource(SurvivorRepository repo) {
		this.repo = repo;
	}
	
	@POST
	public Response registerSurvivor(SurvivorModel newSurvivor, @Context UriInfo uriInfo) {
		Survivor unwrapped = newSurvivor.unwrap();
		repo.store(unwrapped);
		
		return Response.created(uriInfo.getAbsolutePathBuilder()
				.path(Long.toString(unwrapped.getId()))
				.build()).build();
	}
	
	@GET
	public Response findAll() {
		return Response.ok(repo.findAll()).build();
	}
	
	@GET
	@Path("{id}")
	public Response findOne(@PathParam("id") Long id) {
		Survivor result = repo.findOne(id);
		
		return (result != null ? 
				Response.ok(new SurvivorModel(result)) : Response.status(Status.NOT_FOUND)).build();
	}
	
}