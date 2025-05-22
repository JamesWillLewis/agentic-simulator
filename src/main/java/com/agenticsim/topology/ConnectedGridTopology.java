package com.agenticsim.topology;

import com.agenticsim.agent.Agent;
import com.agenticsim.connection.Connector;

import java.util.List;

/**
 * A hybrid topology that both places agents on a 2-dimensional grid and also allows for agents to be connected
 * through graph-like connections. Essentially this layers a graph topology on a grid topology.
 *
 */
public class ConnectedGridTopology implements Topology, Connectable {

    private final GraphTopology graphTopologyLayer;
    private final GridTopology gridTopologyLayer;

    public ConnectedGridTopology() {
        this.graphTopologyLayer = null;
        this.gridTopologyLayer = null;
    }

    @Override
    public Connector connect(Agent source, Agent dest) {
        return null;
    }

    @Override
    public List<Agent> getConnections(Agent agent) {
        return null;
    }

    @Override
    public void addAgent(Agent agent) {

    }
}
