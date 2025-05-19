package com.simplesystemsim.environment;

import com.simplesystemsim.chronology.History;
import com.simplesystemsim.chronology.Ticker;
import com.simplesystemsim.topology.Topology;

/**
 * A discrete time environment enacts agents and transitions state across discrete units of times called "ticks".
 *
 * @see com.simplesystemsim.chronology.Tick
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

}
