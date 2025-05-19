package com.simplesystemsim.environment;

import com.simplesystemsim.topology.Topology;

/**
 * A continuous environment does not distinct steps or "ticks" between state. Instead, agents
 * perform concurrently more like in a real-life distributed system.
 *
 */
public abstract class ContinuousTimeEnvironment<T extends Topology> implements Environment<T> {

}
