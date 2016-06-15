package br.com.ggdio.zssn.application.rest;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UnhandledExceptionMapper implements ExceptionMapper<Exception> {

	@Override
	public Response toResponse(Exception exception) {
		return Response.serverError().entity(new Error("Zombie attack: " + exception.getMessage())).build();
	}
	
	@SuppressWarnings("unused")
	private static class Error {
		final String message;
		
		public Error(String message) {
			this.message = message;
		}
	}

}
