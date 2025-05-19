package com.simplesystemsim.connections;

import com.simplesystemsim.agent.Agent;
import com.simplesystemsim.agent.AgentInput;
import com.simplesystemsim.agent.AgentOutput;
import com.simplesystemsim.agent.AgentState;
import com.simplesystemsim.environment.EnvironmentContext;

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
