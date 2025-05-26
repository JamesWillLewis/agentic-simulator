package com.agenticsim.agent;

import com.agenticsim.behavior.Behavior;
import com.agenticsim.common.Id;
import com.agenticsim.connection.Connection;
import com.agenticsim.environment.EnvironmentContext;

import java.util.Collection;
import java.util.Collections;
import java.util.Objects;

/**
 *
 */
public abstract class AbstractAgent implements Agent {

    private final Id id;

    public AbstractAgent(final Id id) {
        this.id = id;
    }

    public AbstractAgent() {
        this(new Id());
    }

    @Override
    public AgentOutput enact(EnvironmentContext context, AgentInput input) {
        return null;
    }

    @Override
    public Collection<Connection> getConnections() {
        return Collections.emptyList();
    }

    @Override
    public AgentState getState() {
        return null;
    }

    @Override
    public Collection<Behavior> getBehaviors() {
        return Collections.emptyList();
    }

    @Override
    public Id getId() {
        return this.id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractAgent that = (AbstractAgent) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }
}
