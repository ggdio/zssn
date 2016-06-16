package br.com.ggdio.zssn.application.rest;

import java.util.Date;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class UnhandledExceptionMapper implements ExceptionMapper<Throwable> {

	@Override
	public Response toResponse(Throwable throwable) {
		return Response.serverError().entity(
				new Error("[WARNING] Zombie Attack Details: " + throwable.getMessage(), throwable)
			).build();
	}
	
	@SuppressWarnings("unused")
	private static class Error {
		final String message;
		final Throwable throwable;
		
		public Error(String message, Throwable throwable) {
			this.message = message;
			this.throwable = throwable;
		}
		
		public String getMessage() {
			return message;
		}
		
		public Date getTimestamp() {
			return new Date();
		}
		
		public Throwable getThrowable() {
			return throwable;
		}
		
	}

}
