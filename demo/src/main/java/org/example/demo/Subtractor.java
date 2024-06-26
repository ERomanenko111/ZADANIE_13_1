package org.example.demo;

import org.example.Operation;
import org.springframework.stereotype.Component;

@Component
public class Subtractor implements Operation {
    @Override
    public double getResult(double a, double b) {
        return a - b;
    }
}