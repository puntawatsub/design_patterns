package com.puntawat.memento_code;

import javafx.application.Platform;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private Model model;
    private Gui gui;
    private List<IMemento> history; // memento.guistate.com.puntawat.memento_code.Memento history
    private List<IMemento> redoHistory;
    private IMemento currentMemento = null;

    public Controller(Gui gui) {
        this.model = new Model();
        this.gui = gui;
        this.history = new ArrayList<>();
        this.redoHistory = new ArrayList<>();
    }

    private static void run() {

    }

    public void setOption(int optionNumber, int choice) {
        saveToHistory();
        model.setOption(optionNumber, choice);
    }

    public int getOption(int optionNumber) {
        return model.getOption(optionNumber);
    }

    public void setIsSelected(boolean isSelected) {
        saveToHistory();
        redoHistory = new ArrayList<>();
        model.setIsSelected(isSelected);
    }

    public boolean getIsSelected() {
        return model.getIsSelected();
    }

    public void undo() {
        if (!history.isEmpty()) {
            System.out.println("com.puntawat.memento_code.Memento found in history");
            saveToRedoList();
            IMemento previousState = history.remove(history.size() - 1);
            model.restoreState(previousState);
            gui.updateGui();
//            currentMemento = previousState;
            gui.updateListView();
        }
    }

    public void undo(IMemento memento) {
        if (!history.isEmpty() && history.stream().anyMatch(memento1 -> memento1.equals(memento))) {
            int index = history.indexOf(memento);
            redoHistory.addAll(history.subList(index, history.size()));
            model.restoreState(memento);
            Platform.runLater(() -> {
                gui.updateGui();
            });
            if (index != history.size() - 1) {
                currentMemento = memento;
            }
            System.out.println("Infinite loop check");
        }
    }

    public void redo() {
        if (!redoHistory.isEmpty()) {
            saveToHistory();
            IMemento redoState = redoHistory.remove(redoHistory.size() - 1);
            model.restoreState(redoState);
            gui.updateGui();
//            currentMemento = (Memento) redoState;
        }
    }

    private void saveToHistory() {
        int index = history.indexOf(currentMemento);
        if (!history.isEmpty() && currentMemento != null && index != -1) {
            history.subList(index, history.size()).clear();
            currentMemento = null;
        }
        IMemento currentState = model.createMemento();
        history.add(currentState);
        gui.updateListView();
//        currentMemento = currentState;
    }

    private void saveToRedoList() {
        IMemento currentState = model.createMemento();
        redoHistory.add(currentState);
    }

    public List<IMemento> getHistory() {
        return history;
    }
}
