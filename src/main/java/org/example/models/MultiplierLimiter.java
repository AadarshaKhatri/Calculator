package org.example.models;

public class MultiplierLimiter extends Exception{
    @Override
    public String getMessage() {
        return "Cannot multiply by more than 7000";
    }

    @Override
    public String toString() {
        return "Cannot multiply by more than 7000";
    }
}

