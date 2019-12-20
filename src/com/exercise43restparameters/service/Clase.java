package com.exercise43restparameters.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/msgs")
public class Clase {

	@POST
	@Path("/Suma/{numero1}/{numero2}")
	//@Consumes(MediaType.APPLICATION_JSON)
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Result sumaNumeros(@PathParam("numero1") double numero1, @PathParam("numero2") double numero2)
	{
		Result result = new Result();
		result.resultSum = numero1 + numero2;
		return result;
	}
	
	@GET
	@Path("/hola/{numero}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Result diSimon(@PathParam("numero") int numero)
	{
		 Result res = new Result();
		 int lol = 1;
		 for(int i = numero; i>0;i-- )
		 {
			 lol = lol * i;
			 res.factorial[i] = lol;
		 }
		 
		
		 return res;
	
	}
	
    public double factorial (double numero) {
        if (numero==0)
          return 1;
        else
          return numero * factorial(numero-1);
      }
	
	@DELETE
	public String diHolaDelete()
	{
		return "delete";
	}

	
	@PUT
	public String diHolaPut()
	{
		return "Put method";
	}
	
	@HEAD
	public String diHolaHead()
	{
		return "Head method";
	}
}
