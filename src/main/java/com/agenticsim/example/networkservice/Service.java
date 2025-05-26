package com.agenticsim.example.networkservice;

import com.agenticsim.environment.ContinuousTimeEnvironment;
import com.agenticsim.topology.GraphTopology;

public class Service extends ContinuousTimeEnvironment<GraphTopology> {

    @Override
    public GraphTopology assembleTopology() {
        return new GraphTopology();
    }
}
