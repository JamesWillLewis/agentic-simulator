package com.agenticsim.connection;

import com.agenticsim.agent.Agent;
import com.agenticsim.agent.AgentInput;
import com.agenticsim.agent.AgentOutput;
import com.agenticsim.agent.AgentState;
import com.agenticsim.environment.EnvironmentContext;

import java.util.Collection;

/**
 * A message bus enables many-to-many communications between agents.
 * This acts as an agent, and has groups of collections for both incoming and outgoing connections.
 */
public class MessageBus implements Agent {
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
