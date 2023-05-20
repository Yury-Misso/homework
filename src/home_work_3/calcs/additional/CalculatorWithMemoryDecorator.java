package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorWithMemoryDecorator implements ICalculator {

    private ICalculator calc;

    public CalculatorWithMemoryDecorator(ICalculator iCalculator) {
        this.calc = iCalculator;
    }

    public ICalculator getCalculator() {
        return this.calc;
    }

    private double lastResult = 0.0;
    private boolean isSave = false;

    public void save() {
        this.isSave = true;
    }

    public double load() {
        if (isSave) {
            double temp = this.lastResult;
            this.lastResult = 0;
            this.isSave = false;
            return temp;
        } else {
            return 0;
        }
    }

    @Override
    public double sqrt(double a) {
        if (isSave) {
            this.lastResult = this.calc.sqrt(a);
            return this.lastResult;
        } else {
            return this.calc.sqrt(a);
        }
    }

    @Override
    public double abs(double a) {
        if (isSave) {
            this.lastResult = this.calc.abs(a);
            return this.lastResult;
        } else {
            return this.calc.abs(a);
        }
    }

    @Override
    public double pow(double a, double b) {
        if (isSave) {
            this.lastResult = this.calc.pow(a, b);
            return this.lastResult;
        } else {
            return this.calc.pow(a, b);
        }
    }

    @Override
    public double divide(double a, double b) {
        if (isSave) {
            this.lastResult = this.calc.divide(a, b);
            return this.lastResult;
        } else {
            return this.calc.divide(a, b);
        }
    }

    @Override
    public double multiply(double a, double b) {
        if (isSave) {
            this.lastResult = this.calc.multiply(a, b);
            return this.lastResult;
        } else {
            return this.calc.multiply(a, b);
        }
    }

    @Override
    public double minus(double a, double b) {
        if (isSave) {
            this.lastResult = this.calc.minus(a, b);
            return this.lastResult;
        } else {
            return this.calc.minus(a, b);
        }
    }

    @Override
    public double sum(double a, double b) {
        if (isSave) {
            this.lastResult = this.calc.sum(a, b);
            return this.lastResult;
        } else {
            return this.calc.sum(a, b);
        }
    }

}
