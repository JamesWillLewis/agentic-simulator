package com.simplesystemsim.connections;

import com.simplesystemsim.agent.Agent;

/**
 * A connection is some type of directed association between 2 agents.
 * Connections are only applicable to Graph-type topologies.
 *
 * @see com.simplesystemsim.topology.GraphTopology
 */
public interface Connection {

    /**
     * The source of the connection (the tail node of the vertex).
     *
     * @return The source agent of the connection.
     */
    Agent from();

    /**
     * The destination of the connection (the head node of the vertex).
     *
      * @return The destination agent of the connection.
     */
    Agent to();
}
