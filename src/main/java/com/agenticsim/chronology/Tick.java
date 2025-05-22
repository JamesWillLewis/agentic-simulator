package com.agenticsim.chronology;


/**
 * A tick represents the smallest increment of "time" in a discrete time environment,
 * or a single change of state in a continuous-time environment.
 */
public class Tick {

    private final int generationId;

    public Tick(int generationNumber) {
        this.generationId = generationNumber;
    }

    public int getGenerationId() {
        return generationId;
    }
}
