package com.agenticsim.environment;

import com.agenticsim.chronology.Ticks;
import com.agenticsim.topology.Topology;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

/**
 * A continuous environment does not distinct steps or "ticks" between state. Instead, agents
 * perform concurrently more like in a real-life distributed system.
 *
 */
public abstract class ContinuousTimeEnvironment<T extends Topology> extends AbstractEnvironment<T> {


    @Override
    public void runFor(Ticks ticks) {

    }

    @Override
    public void runFor(Duration duration) {

    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }
}
