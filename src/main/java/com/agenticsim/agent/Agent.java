package com.agenticsim.agent;

import com.agenticsim.behavior.Behavior;
import com.agenticsim.common.Id;
import com.agenticsim.common.Identifiable;
import com.agenticsim.connection.Connection;
import com.agenticsim.environment.EnvironmentContext;

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
public interface Agent extends Identifiable {

    AgentOutput enact(final EnvironmentContext context, final AgentInput input);

    Collection<Connection> getConnections();

    Collection<Behavior> getBehaviors();

    AgentState getState();

    @Override
    Id getId();

}
