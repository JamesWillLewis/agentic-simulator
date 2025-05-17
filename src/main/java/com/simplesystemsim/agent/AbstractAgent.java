package com.simplesystemsim.agent;

import com.simplesystemsim.environment.AbstractEnvironment;

/**
 *
 */
public abstract class AbstractAgent implements Agent {


    @Override
    public void attach(AbstractEnvironment environment) {
        environment.associate(this);
    }
}
