package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {

    private long counter = 0;

    private void incrementCountOperation() {
        this.counter++;
    }

    public long getCountOperation() {
        return this.counter;
    }

    @Override
    public double sqrt(double a) {
        incrementCountOperation();
        return Math.sqrt(a);
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return Math.abs(a);
    }

    @Override
    public double pow(double a, double b) {
        incrementCountOperation();
        return Math.pow(a, b);
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return a * b;
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return a - b;
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return a + b;
    }
}
