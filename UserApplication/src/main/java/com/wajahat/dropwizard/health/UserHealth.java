package com.wajahat.dropwizard.health;

import com.codahale.metrics.health.HealthCheck;

public class UserHealth extends HealthCheck {
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
