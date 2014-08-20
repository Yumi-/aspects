package com.aspects.website.ws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Interface for Recruit WS
 *
 * Created on 20/08/2014
 */

@Path("/recruit")
public interface IRecruitWS {

    /**
     * Get recruit by id
     *
     * @param pRecruitId the recruit id
     * @return the response
     */
    @GET
    @Path("/get/{recruitId}")
    @Produces(value = MediaType.APPLICATION_JSON)
    Response getRecruitById(@PathParam("recruitId")final Integer pRecruitId);

    /**
     * Find all classes
     */
    @GET
    @Path("/findAll/class")
    @Produces(value = MediaType.APPLICATION_JSON)
    Response findAllClasses();

    /**
     * Find all roles
     */
    @GET
    @Path("/findAll/role")
    @Produces(value = MediaType.APPLICATION_JSON)
    Response findAllRoles();

}
