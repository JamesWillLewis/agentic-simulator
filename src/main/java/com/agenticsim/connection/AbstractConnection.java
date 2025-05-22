package com.agenticsim.connection;

import com.agenticsim.agent.Agent;

public abstract class AbstractConnection implements Connection {

    private final Agent sourceAgent;
    private final Agent destAgent;

    public AbstractConnection(Agent sourceAgent, Agent destAgent) {
        this.sourceAgent = sourceAgent;
        this.destAgent = destAgent;
    }

    @Override
    public Agent from() {
        return sourceAgent;
    }

    @Override
    public Agent to() {
        return destAgent;
    }
}
