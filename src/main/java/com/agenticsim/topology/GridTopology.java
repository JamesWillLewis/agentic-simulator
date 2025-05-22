package com.agenticsim.topology;

import com.agenticsim.agent.Agent;

/**
 * Arranges agents on a 2-dimensional grid, with agents related to others within the grid based on proximity.
 * This does not implement the {@link Connectable} interface, as all connections are implicit based on adjacency in the grid.
 */
public class GridTopology implements Topology {
    @Override
    public void addAgent(Agent agent) {

    }

}
