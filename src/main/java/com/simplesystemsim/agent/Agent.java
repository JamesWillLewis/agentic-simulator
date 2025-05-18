package com.simplesystemsim.agent;

import com.simplesystemsim.environment.Environment;

import java.util.Collection;

public interface Agent {

    AgentOutput enact(final Environment environment, final AgentInput input);

    Collection<Agent> getRelations();

    AgentState getState();
 }
