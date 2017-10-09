package com.grocerieslistforecast.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by epinsach on 09/10/2017.
 */
@Path("/glf")
public class GroceriesListForecastResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(){
        return "Got it again";
    }
}
