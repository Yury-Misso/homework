package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterAutoSuper extends CalculatorWithMathExtends {
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
        return super.sqrt(a);
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return super.abs(a);
    }

    @Override
    public double pow(double a, double b) {
        incrementCountOperation();
        return super.pow(a, b);
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        return super.divide(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return super.multiply(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return super.minus(a, b);
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return super.sum(a, b);
    }
}
