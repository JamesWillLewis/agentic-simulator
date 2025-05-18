package com.simplesystemsim.environment;

/**
 * In a generational environment, the inputs to all agents during a tick are entirely a function of the state of the
 * previous generation.
 */
public class GenerationalEnvironment extends DiscreteEnvironment {
    public GenerationalEnvironment(int generationDepth) {
        super(generationDepth);
    }
}
