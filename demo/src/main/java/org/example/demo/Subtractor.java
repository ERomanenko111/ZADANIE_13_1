package org.example.demo;

public class Subtractor implements org.example.Operation {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}