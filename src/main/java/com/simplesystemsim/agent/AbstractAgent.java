package com.simplesystemsim.agent;

import com.simplesystemsim.environment.Environment;

import java.util.Collection;

/**
 *
 */
public abstract class AbstractAgent implements Agent {

    @Override
    public AgentOutput enact(Environment environment, AgentInput input) {
        return null;
    }

    @Override
    public Collection<Agent> getRelations() {
        return null;
    }

    @Override
    public AgentState getState() {
        return null;
    }
}
