package com.agenticsim.topology;

import com.agenticsim.agent.Agent;
import com.agenticsim.connection.Connection;
import com.agenticsim.connection.Connector;

import java.util.List;

public interface Connectable {

    Connector connect(Agent source, Agent dest);

    void addConnection(Connection connection);

    List<Agent> getConnections(Agent agent);

}
