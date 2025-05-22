package com.agenticsim.chronology;

/**
 * A history represents environment state at each tick.
 *
 * @see com.agenticsim.environment.EnvironmentContext
 * @see Tick
 */
public class History {

    private final int historyDepth;

    public History(int historyDepth) {
        this.historyDepth = historyDepth;
    }
}
