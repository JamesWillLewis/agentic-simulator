package com.agenticsim.connection;

import com.agenticsim.agent.Agent;

/**
 * A simple one-to-one message pipe.
 */
public class MessagePipe extends MessageConnection {


    public MessagePipe(Agent sourceAgent, Agent destAgent) {
        super(sourceAgent, destAgent);
    }
}
