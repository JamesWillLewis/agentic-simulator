package com.simplesystemsim.topology;

import com.simplesystemsim.agent.Agent;

import java.util.List;

/**
 * A topology controls the way agents are arranged and connected.
 */
public interface Topology {

    void addAgent(Agent agent);

    List<Agent> getConnections(Agent agent);

}
