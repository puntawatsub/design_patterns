package com.puntawat.memento_code;

import java.time.Instant;
import java.util.Objects;

public class Memento implements IMemento {
    private int[] options;
    private boolean isSelected;

    private final String timestamp;

    public Memento(int[] options, boolean isSelected) {
        this.options = options.clone(); // Copy options array
        this.isSelected = isSelected;
        System.out.println("com.puntawat.memento_code.Memento created");
        this.timestamp = String.valueOf(Instant.now());
    }

    public int[] getOptions() {
        return options;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public String getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Memento memento = (Memento) o;
        return Objects.equals(getTimestamp(), memento.getTimestamp());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getTimestamp());
    }
}
