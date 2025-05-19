package com.simplesystemsim.topology;

import com.simplesystemsim.agent.Agent;

import java.util.List;

/**
 * Arranges agents on a 2-dimensional grid, with agents related to others within the grid based on proximity.
 */
public class GridTopology implements Topology {
    @Override
    public void addAgent(Agent agent) {

    }

    @Override
    public List<Agent> getConnections(Agent agent) {
        return null;
    }
}
