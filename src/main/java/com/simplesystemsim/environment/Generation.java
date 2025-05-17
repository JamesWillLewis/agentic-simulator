package com.simplesystemsim.environment;

public class Generation {

    private final int generationId;

    public Generation(int generationNumber) {
        this.generationId = generationNumber;
    }

    public int getGenerationId() {
        return generationId;
    }
}
