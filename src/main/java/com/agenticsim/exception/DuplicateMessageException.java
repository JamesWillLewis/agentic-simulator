package com.agenticsim.exception;

public class DuplicateMessageException extends RuntimeException {
    public DuplicateMessageException() {
        super("An unreceived message already exists. This probably means the connection has no destination.");
    }
}
