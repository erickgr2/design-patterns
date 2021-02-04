package org.acme;

import org.acme.patterns.*;

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

    @GET
    @Path("singleton-thread-safe-optimized")
    @Produces(MediaType.APPLICATION_JSON)
    public String singletonThreadSafeOptimized() {
        return "This singleton is " + SingletonThreadSafeOptimized.getInstance().getMessage();
    }

    @GET
    @Path("singleton-enum")
    @Produces(MediaType.APPLICATION_JSON)
    public String singletonEnum(){
        return "This singleton is " + SingletonEnum.INSTANCE.getMessage();
    }


}