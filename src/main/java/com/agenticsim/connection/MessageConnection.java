package com.agenticsim.connection;

import com.agenticsim.agent.Agent;
import com.agenticsim.exception.DuplicateMessageException;

public abstract class MessageConnection extends AbstractConnection {

    private Message message;

    public MessageConnection(final Agent sourceAgent, final Agent destAgent) {
        super(sourceAgent, destAgent);
        this.message = null;
    }

    public void sendMessage(final Message m) {
        if (this.message == null) {
            throw new DuplicateMessageException();
        }
        this.message = m;
    }

    public Message receiveMessage() {
        final Message m = this.message;
        this.message = null;
        return m;
    }

}


