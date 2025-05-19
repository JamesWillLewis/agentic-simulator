package com.simplesystemsim.connections;

import com.simplesystemsim.agent.Agent;

/**
 * A simple one-to-one message pipe.
 */
public class MessagePipe extends MessageConnection {
    @Override
    public Agent from() {
        return null;
    }

    @Override
    public Agent to() {
        return null;
    }
}
