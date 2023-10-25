package ch.zli.m223;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.PathParam;

@Path("/calculator")
public class CalculatorResource {

    @GET
    @Path("/add/{number}/{number2}")
    @Produces(MediaType.TEXT_PLAIN)
    public String add(@PathParam("number") int number, @PathParam("number2") int number2){
        int result = number + number2;
        return String.valueOf(result);
    }
}
