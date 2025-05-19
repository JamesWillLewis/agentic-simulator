package com.simplesystemsim.topology;

/**
 * A hybrid topology that both places agents on a 2-dimensional grid and also allows for agents to be connected
 * through graph-like connections. Essentially this layers a graph topology on a grid topology.
 *
 */
public class ConnectedGridTopology {

    private final GraphTopology graphTopologyLayer;
    private final GridTopology gridTopologyLayer;

    public ConnectedGridTopology() {
        this.graphTopologyLayer = null;
        this.gridTopologyLayer = null;
    }
}
