package com.agenticsim.environment;

import com.agenticsim.chronology.Ticks;
import com.agenticsim.topology.Topology;

import java.time.Duration;

public interface Environment<T extends Topology> {

    T assembleTopology();

    /**
     * Runs the simulation indefinitely until {@link #stop()} is invoked.
     */
    void start();

    /**
     * Run the simulation for this time duration, and then stop.
     * For discrete-time environments, the ticks-per-second rate sets an upper bound on the number of ticks per second.
     * For very complex topologies or very high tick rates, the actual rate might be lower, effectively
     * slowing down the simulation.
     *
     * @param duration the duration to run the simulation for
     */
    void runFor(Duration duration);

    /**
     * Run the simulation for this number of ticks, and then stop.
     * For continuous-time environments, a tick is measured as a change in state.
     *
     * @param ticks the number of ticks to run the simulation for
     */
    void runFor(Ticks ticks);

    /**
     * Stops the simulation.
     */
    void stop();

}
