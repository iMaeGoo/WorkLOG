package com.maemn.worklog.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/login")
public class LoginController {
    @GET
    @Produces("text/plain")
    public String getMessage() {
        return "Hello world!";
    }
}
