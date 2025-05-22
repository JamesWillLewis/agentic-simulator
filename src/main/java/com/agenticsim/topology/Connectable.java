package com.agenticsim.topology;

import com.agenticsim.agent.Agent;
import com.agenticsim.connection.Connector;

import java.util.List;

public interface Connectable {

    Connector connect(Agent source, Agent dest);

    List<Agent> getConnections(Agent agent);

}
