package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathCopy implements ICalculator {
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    public double abs(double a) {
        return Math.abs(a);
    }

    public double pow(double a, double b) {
        return Math.pow(a, b);
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divide by zero");
        }
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double minus(double a, double b) {
        return a - b;
    }

    public double sum(double a, double b) {
        return a + b;
    }
}
