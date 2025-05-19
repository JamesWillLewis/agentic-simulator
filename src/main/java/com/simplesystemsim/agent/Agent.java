package com.simplesystemsim.agent;

import com.simplesystemsim.connections.Connection;
import com.simplesystemsim.environment.EnvironmentContext;

import java.util.Collection;

/**
 * An agent is an autonomous actor in the system, and must always have these characteristics:
 *  <ol>
     *  <li>Some internal state, which can potentially change between ticks</li>
     *  <li>Connections with other agents, which control how agents interact between themselves</lis>
     *  <li>Behaviors that the agent performs at each tick</li>
 *  </ol>
 *
 */
public interface Agent {

    AgentOutput enact(final EnvironmentContext context, final AgentInput input);

    Collection<Connection> getConnections();

    AgentState getState();
 }
