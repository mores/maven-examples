package com.example;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("swagger/myEntity")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
public class MyEntitySwaggerAPI {
    @GET
    public Response getMyEntity() {
        MyEntity myEntity = new MyEntity();

        myEntity.setId("myEntity - id");
        myEntity.setCode("myEntity - code");
        myEntity.setDesc("myEntity - desc");

        return Response.ok(myEntity).build();
    }
}
