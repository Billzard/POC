package com.billzard.ws.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/customer")
public class MerchantService {

	@POST
	@Path("/create")
	public Response createMerchant(){
		return null;
	}
	
	@GET
	@Path("/getMerchant")
	public Response getMerchantDetails(){
		return null;
	}
	
	@GET
	@Path("/getMerchantHistory")
	public Response getMerchantSellingDetails(){
		return null;
	}
}
