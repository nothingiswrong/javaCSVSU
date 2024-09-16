package org.example;

public class Calculator implements BaseOperationsCalculator {

    @Override
    public int sum(int x, int y) {
        return x + y;
    }

    @Override
    public int divide(int x, int y) {
        return x - y;
    }

    @Override
    public int substract(int x, int y) {
        return x / y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }
}
