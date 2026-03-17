package com.puntawat.memento_code;

public interface IMemento {
    // memento metadata methods
    int[] getOptions();
    boolean isSelected();
    String getTimestamp();
}
