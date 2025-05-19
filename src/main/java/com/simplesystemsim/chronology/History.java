package com.simplesystemsim.chronology;

/**
 * A history represents environment state at each tick.
 *
 * @see com.simplesystemsim.environment.EnvironmentContext
 * @see Tick
 */
public class History {

    private final int historyDepth;

    public History(int historyDepth) {
        this.historyDepth = historyDepth;
    }
}
