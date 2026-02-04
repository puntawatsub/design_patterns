package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {

    private BufferedWriter writer;

    private static Logger instance;
    private Logger() {
        try {
            writer = new BufferedWriter(new FileWriter("log.txt", true));
        } catch (IOException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void setFileName(String fileName) {
        try {
            writer.close();
            writer = new BufferedWriter(new FileWriter(fileName, true));
        } catch (IOException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }
    }

    public void write(String text) {
        try {
            writer.append(String.format("%s%n", text));
        } catch (IOException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }
    }

    public void close() {
        try {
            writer.close();
        } catch (IOException e) {
            System.out.printf("Error: %s%n", e.getMessage());
        }
    }
}
