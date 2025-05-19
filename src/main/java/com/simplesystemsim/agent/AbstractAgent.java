package com.simplesystemsim.agent;

import com.simplesystemsim.connections.Connection;
import com.simplesystemsim.environment.EnvironmentContext;

import java.util.Collection;

/**
 *
 */
public abstract class AbstractAgent implements Agent {

    @Override
    public AgentOutput enact(EnvironmentContext context, AgentInput input) {
        return null;
    }

    @Override
    public Collection<Connection> getConnections() {
        return null;
    }

    @Override
    public AgentState getState() {
        return null;
    }
}
