package org.example.models;

public class MaxInputExe extends Exception{
    @Override
    public String getMessage() {
        return "Please Try lower number than 1 lakh";
    }

    @Override
    public String toString() {
        return "Please Try lower number than 1 lakh";
    }
}
