package com.agenticsim.example.gameoflife;

import com.agenticsim.environment.DiscreteTimeEnvironment;
import com.agenticsim.topology.GridTopology;

public class Ecosystem extends DiscreteTimeEnvironment<GridTopology> {
    public Ecosystem(int generationDepth) {
        super(generationDepth);
    }

    @Override
    public void assemble(GridTopology topology) {

    }
}
