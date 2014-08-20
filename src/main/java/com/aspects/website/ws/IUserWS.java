package com.aspects.website.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface for User WS
 *
 * Created on 20/08/2014
 */
@Path("/user")
public interface IUserWS {

    /**
     * Get user by id
     *
     * @param pUserId the user id
     * @return the response
     */
    @GET
    @Path("/get/{userId}")
    @Produces(value = MediaType.APPLICATION_JSON)
    Response getUserById(@PathParam("userId")final Integer pUserId);

}
