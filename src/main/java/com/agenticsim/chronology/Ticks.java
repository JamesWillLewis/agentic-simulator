package com.agenticsim.chronology;

public class Ticks {

    private final long ticks;

    public Ticks(long ticks) {
        this.ticks = ticks;
    }

    public long value() {
        return ticks;
    }

    public static Ticks of(final long ticks) {
        return new Ticks(ticks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticks ticks1 = (Ticks) o;
        return ticks == ticks1.ticks;
    }

}
