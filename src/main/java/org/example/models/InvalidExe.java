package org.example.models;

public class InvalidExe extends Exception {
    @Override
    public String getMessage() {
        return "There's some error in the code";
    }

    @Override
    public String toString() {
        return "There's some error in the code";
    }
}
