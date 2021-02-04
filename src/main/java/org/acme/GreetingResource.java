package org.acme;

import org.acme.patterns.Singleton;
import org.acme.patterns.SingletonEager;
import org.acme.patterns.SingletonThreadSafe;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/pattern")
public class GreetingResource {

    @GET
    @Path("singleton")
    @Produces(MediaType.APPLICATION_JSON)
    public String singleton() {
        return "This singleton is " + Singleton.getInstance().getMessage();
    }

    @GET
    @Path("singleton-eager")
    @Produces(MediaType.APPLICATION_JSON)
    public String singletonEager() {
        return "This singleton is " + SingletonEager.getInstance().getMessage();
    }


    @GET
    @Path("singleton-thread-safe")
    @Produces(MediaType.APPLICATION_JSON)
    public String singletonThreadSafe() {
        return "This singleton is " + SingletonThreadSafe.getInstance().getMessage();
    }
}