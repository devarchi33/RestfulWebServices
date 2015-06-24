package com.skyfly33.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/helloworld")
public class HelloWorldResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("{name : ([a-zA-Z])*}")
	public String greeting(@PathParam("name") String name) {
		return "Hello, " + name;
	}
}
