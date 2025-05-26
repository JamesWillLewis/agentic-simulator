package com.agenticsim.environment;

import com.agenticsim.topology.GraphTopology;
import com.agenticsim.topology.Topology;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public abstract class AbstractEnvironment<T extends Topology> implements Environment<T> {

    protected final T topology;

    protected AbstractEnvironment() {
        topology = null;
    }
}
