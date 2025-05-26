package com.agenticsim.common;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Objects;

public class Id {

    private static final int DEFAULT_ID_LENGTH = 8;
    private final String id;

    public Id(final String id) {
        this.id = id;
    }

    public Id() {
        this.id = generateAlphanumericId();
    }

    private String generateAlphanumericId() {
        return RandomStringUtils.secure().nextAlphanumeric(Id.DEFAULT_ID_LENGTH);
    }

    @Override
    public String toString() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(this.id, ((Id) o).id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
