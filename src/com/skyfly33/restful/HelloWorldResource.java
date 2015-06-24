package com.skyfly33.restful;

import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.Produces;

@Path("helloworld")
public class HelloWorldResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greeting() {
		return "Hello,World!!";
	}
}
