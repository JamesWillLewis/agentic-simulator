package com.simplesystemsim.agent;

import com.simplesystemsim.environment.Environment;

/**
 *
 */
public abstract class AbstractAgent implements Agent {


    @Override
    public void attach(Environment environment) {
        environment.associate(this);
    }

    @Override
    public void enact(Environment environment) {

    }

    @Override
    public Relationship relate(Agent agent) {
        return null;
    }
}
