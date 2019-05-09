package com.wajahat.dropwizard.rest;

import com.wajahat.dropwizard.domain.User;
import com.wajahat.dropwizard.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/users")
@Produces(MediaType.APPLICATION_JSON)
public class UserController {

    private UserService userService;

    public UserController() {
        userService = new UserService();
    }

    @GET
    public List<User> getUsers() {
        return userService.getUsers();
    }

}
