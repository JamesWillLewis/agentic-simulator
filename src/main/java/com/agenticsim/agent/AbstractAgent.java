package com.agenticsim.agent;

import com.agenticsim.connection.Connection;
import com.agenticsim.environment.EnvironmentContext;

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
