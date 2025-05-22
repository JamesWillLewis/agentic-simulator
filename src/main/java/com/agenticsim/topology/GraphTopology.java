package com.agenticsim.topology;

import com.agenticsim.agent.Agent;
import com.agenticsim.connection.Connector;

import java.util.List;

/**
 * Arranges agents as a graph, with each agent represented as a node and the edges as relationships between agents.
 */
public class GraphTopology implements Topology, Connectable {
    @Override
    public void addAgent(Agent agent) {

    }

    @Override
    public Connector connect(Agent source, Agent dest) {
        return new Connector(source, dest);
    }

    @Override
    public List<Agent> getConnections(Agent agent) {

        return null;

    }


}
