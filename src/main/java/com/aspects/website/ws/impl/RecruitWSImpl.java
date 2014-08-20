package com.aspects.website.ws.impl;

import com.aspects.website.enums.EnumClass;
import com.aspects.website.enums.EnumRequirement;
import com.aspects.website.enums.EnumRole;
import com.aspects.website.model.Recruit;
import com.aspects.website.service.IRecruitService;
import com.aspects.website.ws.IRecruitWS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

/**
 * Implementation of Recruit WS
 *
 * Created on 20/08/2014
 */
@Component
@Path("/recruit")
public class RecruitWSImpl implements IRecruitWS {

    /**
     * The recruit service
     */
    @Autowired
    private IRecruitService recruitService;

    /**
     * Get recruit by id
     *
     * @param pRecruitId the recruit id
     * @return the response
     */
    @GET
    @Path("/get/{recruitId}")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response getRecruitById(@PathParam("recruitId")final Integer pRecruitId){
//        Recruit recruit = recruitService.getRecruitById(pRecruitId);
        Recruit recruit = new Recruit();
        recruit.setEnumClass(EnumClass.DEATH_KNIGHT);
        recruit.setEnumRole(EnumRole.DPS_CAC);
        recruit.setEnumRequirement(EnumRequirement.LOW);
        return Response.status(Response.Status.OK).entity(recruit).build();
    }

    /**
     * Find all classes
     */
    @GET
    @Path("/findAll/class")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response findAllClasses(){
        List<String> enumClassList = new ArrayList<>();
        for(EnumClass value : EnumClass.values()){
            enumClassList.add(value.name());
        }
        return Response.status(Response.Status.OK).entity(enumClassList).build();
    }

    /**
     * Find all roles
     */
    @GET
    @Path("/findAll/role")
    @Produces(value = MediaType.APPLICATION_JSON)
    public Response findAllRoles(){
        List<EnumRole> enumRoleList = new ArrayList<>(EnumSet.allOf(EnumRole.class));
        return Response.status(Response.Status.OK).entity(enumRoleList).build();
    }

}
