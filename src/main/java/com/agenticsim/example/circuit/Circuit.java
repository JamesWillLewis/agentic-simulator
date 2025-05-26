package com.agenticsim.example.circuit;

import com.agenticsim.chronology.Ticks;
import com.agenticsim.environment.DiscreteTimeEnvironment;
import com.agenticsim.topology.GraphTopology;

import java.time.Duration;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Circuit extends DiscreteTimeEnvironment<GraphTopology> {

    @Override
    public GraphTopology assembleTopology() {
        final var topology = new GraphTopology();

        Input input = new Input();
        Output output = new Output();

        topology.addAgent(input);
        topology.addAgent(output);
        topology.connect(input, output).withMessagePipe();

        return topology;
    }

}
