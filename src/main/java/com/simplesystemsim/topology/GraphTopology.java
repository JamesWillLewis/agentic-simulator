package com.simplesystemsim.topology;

import com.simplesystemsim.agent.Agent;

import java.util.List;

/**
 * Arranges agents as a graph, with each agent represented as a node and the edges as relationships between agents.
 */
public class GraphTopology implements Topology {
    @Override
    public void addAgent(Agent agent) {

    }

    @Override
    public List<Agent> getConnections(Agent agent) {
        return null;
    }
}
