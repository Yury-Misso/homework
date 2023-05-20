package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMathExtends extends CalculatorWithOperator implements ICalculator {

    @Override
    public double sqrt(double a) {
        return Math.sqrt(a);
    }

    @Override
    public double abs(double a) {
        return Math.abs(a);
    }

    @Override
    public double pow(double a, double b) {
        return Math.pow(a, b);
    }
}
