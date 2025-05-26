package com.agenticsim.connection;

import com.agenticsim.agent.Agent;
import com.agenticsim.topology.Connectable;

public class Connector {

    private final Connectable connectable;
    private final Agent sourceAgent;
    private final Agent destAgent;

    public Connector(Connectable connectable, Agent sourceAgent, Agent destAgent) {
        this.connectable = connectable;
        this.sourceAgent = sourceAgent;
        this.destAgent = destAgent;
    }

    public void withMessagePipe() {
        connectable.addConnection(new MessagePipe(sourceAgent, destAgent));
    }

}
