package com.simplesystemsim.example.gameoflife;

import com.simplesystemsim.environment.DiscreteTimeEnvironment;
import com.simplesystemsim.topology.GridTopology;

public class Ecosystem extends DiscreteTimeEnvironment<GridTopology> {
    public Ecosystem(int generationDepth) {
        super(generationDepth);
    }

    @Override
    public void arrangeAgents(GridTopology agentTopology) {

    }
}
