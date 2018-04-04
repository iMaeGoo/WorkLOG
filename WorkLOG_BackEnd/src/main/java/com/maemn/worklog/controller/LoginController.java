package com.maemn.worklog.controller;

import com.maemn.worklog.model.UserPO;
import com.maemn.worklog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Controller
@Path("/login")
public class LoginController {
    private UserService userService;

    public LoginController() {
        // Need a non-parametric construction method.
    }

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public UserPO getMessage() {
        return userService.getUser("1");
    }
}
