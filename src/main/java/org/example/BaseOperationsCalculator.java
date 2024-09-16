package org.example;

public interface BaseOperationsCalculator {
    public int sum(int x, int y);
    public int divide(int x, int y) throws ArithmeticException;
    public int substract(int x, int y);
    public int multiply(int x, int y);
}
