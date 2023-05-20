package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoChoiceAgregation {
    private CalculatorWithOperator calcO;
    private CalculatorWithMathCopy calcC;
    private CalculatorWithMathExtends calcE;

    private long counter = 0;


    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithOperator calc) {
        this.calcO = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathCopy calc) {
        this.calcC = calc;
    }

    public CalculatorWithCounterAutoChoiceAgregation(CalculatorWithMathExtends calc) {
        this.calcE = calc;
    }

    private void incrementCountOperation() {
        this.counter++;
    }

    public long getCountOperation() {
        return this.counter;
    }


    public double sqrt(double a) {
        incrementCountOperation();
        if (calcO != null) {
            return calcO.sqrt(a);
        } else if (calcC != null) {
            return calcC.sqrt(a);
        } else {
            return calcE.sqrt(a);
        }
    }

    public double abs(double a) {
        incrementCountOperation();
        if (calcO != null) {
            return calcO.abs(a);
        } else if (calcC != null) {
            return calcC.abs(a);
        } else {
            return calcE.abs(a);
        }
    }

    public double pow(double a, double b) {
        incrementCountOperation();
        if (calcO != null) {
            return calcO.pow(a, b);
        } else if (calcC != null) {
            return calcC.pow(a, b);
        } else {
            return calcE.pow(a, b);
        }
    }

    public double divide(double a, double b) {
        incrementCountOperation();
        if (calcO != null) {
            return calcO.divide(a, b);
        } else if (calcC != null) {
            return calcC.divide(a, b);
        } else {
            return calcE.divide(a, b);
        }
    }

    public double multiply(double a, double b) {
        incrementCountOperation();
        if (calcO != null) {
            return calcO.multiply(a, b);
        } else if (calcC != null) {
            return calcC.multiply(a, b);
        } else {
            return calcE.multiply(a, b);
        }
    }

    public double minus(double a, double b) {
        incrementCountOperation();
        if (calcO != null) {
            return calcO.minus(a, b);
        } else if (calcC != null) {
            return calcC.minus(a, b);
        } else {
            return calcE.minus(a, b);
        }
    }

    public double sum(double a, double b) {
        incrementCountOperation();
        if (calcO != null) {
            return calcO.sum(a, b);
        } else if (calcC != null) {
            return calcC.sum(a, b);
        } else {
            return calcE.sum(a, b);
        }
    }

}
