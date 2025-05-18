package com.simplesystemsim.environment;

import com.simplesystemsim.agent.Agent;

/**
 * A continuous environment does not distinct steps or "ticks" between state. Instead, agents
 * perform concurrently more like in a real-life distributed system.
 *
 */
public abstract class ContinuousEnvironment implements Environment {

}
