package br.com.ggdio.zssn.application.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import br.com.ggdio.zssn.application.rest.resource.SurvivorResource;

@Configuration
@ApplicationPath("/api/v1")
public class JerseyConfig extends ResourceConfig {
	
	public JerseyConfig() throws ClassNotFoundException {
		registerResources();
	}

	private void registerResources() {
		register(SurvivorResource.class);
	}

}
