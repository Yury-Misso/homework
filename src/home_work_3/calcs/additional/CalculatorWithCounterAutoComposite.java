package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithCounterAutoComposite {
    private CalculatorWithMathCopy calc = new CalculatorWithMathCopy();

    private long counter = 0;

    private void incrementCountOperation() {
        this.counter++;
    }

    public long getCountOperation() {
        return this.counter;
    }

    public double sqrt(double a) {
        incrementCountOperation();
        return calc.sqrt(a);
    }

    public double abs(double a) {
        incrementCountOperation();
        return calc.abs(a);
    }

    public double pow(double a, double b) {
        incrementCountOperation();
        return calc.pow(a, b);
    }

    public double divide(double a, double b) {
        incrementCountOperation();
        return calc.divide(a, b);
    }

    public double multiply(double a, double b) {
        incrementCountOperation();
        return calc.multiply(a, b);
    }

    public double minus(double a, double b) {
        incrementCountOperation();
        return calc.minus(a, b);
    }

    public double sum(double a, double b) {
        incrementCountOperation();
        return calc.sum(a, b);
    }
}
