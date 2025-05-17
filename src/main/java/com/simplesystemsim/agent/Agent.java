package com.simplesystemsim.agent;

import com.simplesystemsim.environment.Environment;

public interface Agent {

    void enact(final Environment environment);

    void attach(final Environment environment);

    Relationship relate(Agent agent);
}
