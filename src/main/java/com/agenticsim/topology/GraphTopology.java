package com.agenticsim.topology;

import com.agenticsim.agent.Agent;
import com.agenticsim.common.Id;
import com.agenticsim.connection.Connection;
import com.agenticsim.connection.Connector;
import com.agenticsim.exception.TopologyInitializationException;

import java.util.*;

/**
 * Arranges agents as a graph, with each agent represented as a node and the edges as relationships between agents.
 */
public class GraphTopology implements Topology, Connectable {

    /**
     * Set of all agents in the environment.
     */
    final Set<Agent> agents = new HashSet<>();
    /**
     * Adjacency list of agents in the graph, where the vertices are agents and edges are connections.
     *
     */
    final Map<Id, List<Connection>> agentConnections = new HashMap<>();

    public GraphTopology() {

    }

    @Override
    public void addAgent(Agent agent) {
        agents.add(agent);
    }

    public boolean hasAgent(Agent agent) {
        return agents.contains(agent);
    }

    @Override
    public Connector connect(Agent source, Agent dest) {
        return new Connector(this, source, dest);
    }

    @Override
    public void addConnection(Connection connection) {
        if (!hasAgent(connection.from()) || !hasAgent(connection.to())) {
            throw new TopologyInitializationException("Connection specifies unregistered agents");
        }

        agentConnections.putIfAbsent(connection.from().getId(), new LinkedList<>());
        agentConnections.putIfAbsent(connection.to().getId(), new LinkedList<>());

        agentConnections.get(connection.from().getId()).add(connection);
        agentConnections.get(connection.to().getId()).add(connection);
    }

    @Override
    public List<Agent> getConnections(Agent agent) {

        return null;

    }


}
