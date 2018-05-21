package cl.fuentes.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hola")
public class HelloWorldService {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Prueba Jersey : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	
}

//http://localhost:8080/testrest/rest/hola/alvaro