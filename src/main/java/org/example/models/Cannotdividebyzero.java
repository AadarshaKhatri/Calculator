package org.example.models;

public class Cannotdividebyzero extends Exception{
    @Override
    public String getMessage() {
        return "Cannot divide by 0";
    }

    @Override
    public String toString() {
        return "Cannot divide by 0";
    }
}
