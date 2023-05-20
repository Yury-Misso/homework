package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithCounterAutoDecorator implements ICalculator {

    private ICalculator calc;

    public CalculatorWithCounterAutoDecorator(ICalculator iCalculator) {
        this.calc = iCalculator;
    }

    public ICalculator getCalculator() {
        return this.calc;
    }

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
        return this.calc.sqrt(a);
    }

    @Override
    public double abs(double a) {
        incrementCountOperation();
        return this.calc.abs(a);
    }

    @Override
    public double pow(double a, double b) {
        incrementCountOperation();
        return this.calc.pow(a, b);
    }

    @Override
    public double divide(double a, double b) {
        incrementCountOperation();
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return this.calc.divide(a, b);
    }

    @Override
    public double multiply(double a, double b) {
        incrementCountOperation();
        return this.calc.multiply(a, b);
    }

    @Override
    public double minus(double a, double b) {
        incrementCountOperation();
        return this.calc.minus(a, b);
    }

    @Override
    public double sum(double a, double b) {
        incrementCountOperation();
        return this.calc.sum(a, b);
    }
}
