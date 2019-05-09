package com.wajahat.dropwizard;

import com.wajahat.dropwizard.config.UserConfig;
import com.wajahat.dropwizard.health.UserHealth;
import com.wajahat.dropwizard.rest.UserController;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserApplication extends Application<UserConfig> {

    @Override
    public String getName() {
        return "UserApplication";
    }

    public void run(UserConfig userConfig, Environment environment) throws Exception {
        log.info("registering resources !!!");
        environment.jersey().register(new UserController());
        environment.healthChecks().register("UserHC", new UserHealth());
    }

    public static void main(String args[]) throws Exception {
        new UserApplication().run(args);
    }
}
