package com.skyfly33.restful;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/publish")
public class RestEasyExample {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{message}")
	public Response publishMessage(@PathParam("message") String msgStr) {
		String responseStr = "Received message : " + msgStr;
		System.out.println("Rest Easy!!");
		return Response.status(200).entity(responseStr).build();
	}
}
