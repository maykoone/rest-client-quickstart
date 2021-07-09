package org.acme.rest.client;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@Path("/foo")
@RegisterRestClient
public interface FooRestClient {
    
    @GET
    Response get();
}
