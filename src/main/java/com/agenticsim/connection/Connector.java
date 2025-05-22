package com.agenticsim.connection;

import com.agenticsim.agent.Agent;

public class Connector {

    private final Agent sourceAgent;
    private final Agent destAgent;

    public Connector(Agent sourceAgent, Agent destAgent) {
        this.sourceAgent = sourceAgent;
        this.destAgent = destAgent;
    }

    public Connection withMessagePipe() {
        return new MessagePipe(sourceAgent, destAgent);
    }

}
