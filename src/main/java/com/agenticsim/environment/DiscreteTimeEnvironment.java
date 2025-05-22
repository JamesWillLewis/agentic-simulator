package com.agenticsim.environment;

import com.agenticsim.chronology.History;
import com.agenticsim.chronology.Ticker;
import com.agenticsim.chronology.Ticks;
import com.agenticsim.topology.Topology;

import java.time.Duration;

/**
 * A discrete time environment enacts agents and transitions state across discrete units of times called "ticks".
 *
 * @see com.agenticsim.chronology.Tick
 */
public abstract class DiscreteTimeEnvironment<T extends Topology> implements Environment<T>, Ticker {

    private static final int DEFAULT_GENERATION_DEPTH = 1;

    private final History history;

    public DiscreteTimeEnvironment(int generationDepth) {
        this.history = new History(generationDepth);
    }

    public DiscreteTimeEnvironment() {
        this(DEFAULT_GENERATION_DEPTH);
    }

    @Override
    public int nextTick() {
        return 0;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void runFor(Ticks ticks) {

    }

    @Override
    public void runFor(Duration duration) {

    }
}
