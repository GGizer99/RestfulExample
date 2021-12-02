package com.mkyong.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/json/product")
public class JSONService {

	@GET
	@Path("/get")
	@Produces("application/json")
	public Product getProductInJSON() {

		Product product = new Product();
		product.setName("iPaddd 3");
		product.setQty(999);
		
		return product; 

	}

	@POST
	@Path("/post")
	@Consumes("application/json")
	public Response createProductInJSON(Product product) {

		String result = "Product created : " + product;
		return Response.status(201).entity(result).build();
		
	}

	@POST
	@Path("/hello-man")
	@Consumes("application/json")
	public Response helloMan(Product product) {

		String result = "Hello Man : " + product.getName();
		return Response.status(201).entity(result).build();

	}

	@POST
	@Path("/merhaba")
	@Consumes("application/json")
	public Response merhaba(Product product) {

		String result = "Merhaba : " + product.getName();
		return Response.status(201).entity(result).build();

	}
	
	@POST
	@Path("/hello-tomcat")
	@Consumes("application/json")
	public Response helloTomcat(Product product) {

		String result = "Helllllllo TTomcat : " + product.getName();
		return Response.status(201).entity(result).build();

	}

	
}