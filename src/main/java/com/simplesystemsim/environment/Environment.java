package com.simplesystemsim.environment;

import com.simplesystemsim.agent.Agent;
import com.simplesystemsim.topology.Topology;

public interface Environment<T extends Topology> {

    void arrangeAgents(T agentTopology);

}
