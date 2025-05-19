package com.simplesystemsim.chronology;


/**
 * A generation represents a snapshot of states within a discrete environment.
 * A generation is not synonymous with a tick -- one generation could span many ticks.
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
