package com.simplesystemsim.environment;

import com.simplesystemsim.chronology.Generation;
import com.simplesystemsim.chronology.Ticker;

import java.util.Collection;
import java.util.Collections;

/**
 * An environment which maintains snapshots ("generations") of the state of the environment. At minimum, a generational environment
 * needs to maintain the state of the previous environment (T-1) as to determine the next generation.
 *
 * Agents within a generational environment act on the state of the environment within the current generation.
 * What this means is that when a new generation is being determined, any changes in state of agents (reflected in the new generation)
 * won't impact other agents. This means the order in which agents are evaluated does not impact the state of the next generation.
 */
public abstract class DiscreteEnvironment implements Environment, Ticker {

    private final Collection<Generation> generations = Collections.emptyList();
    private final int generationDepth;

    public DiscreteEnvironment(int generationDepth) {
        this.generationDepth = generationDepth;
    }

    @Override
    public int nextTick() {
        return 0;
    }

}
