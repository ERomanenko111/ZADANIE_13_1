package org.example.demo;

import org.example.Operation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

@Component
public class Calculator {
    private final Map<String, Operation> operations;

    public Calculator(Map<String, Operation> operations) {
        this.operations = operations;
    }

    public void calc(String operationType, double a, double b) throws Exception {
        Optional<Operation> selectedOperation = Optional.ofNullable(operations.get(operationType));

        if(!selectedOperation.isPresent()) {
            throw new Exception("Unsupported operation");
        }

        double result = selectedOperation.get().getResult(a, b);
        System.out.println(result);
    }

    public String getSupportedOperations() {
        return operations.keySet().toString();
    }
}