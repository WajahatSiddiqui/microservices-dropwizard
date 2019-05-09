package com.wajahat.dropwizard.service;

import com.wajahat.dropwizard.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<User>();

    public UserService() {
        users.add(User.builder().id(1L).name("bob").build());
        users.add(User.builder().id(2L).name("martin").build());
        users.add(User.builder().id(3L).name("clark").build());

    }

    public List<User> getUsers() {
        return users;
    }
}
