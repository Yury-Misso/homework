package home_work_3.calcs.simple;

import home_work_3.calcs.api.ICalculator;

import java.util.Arrays;

public class CalculatorWithOperator implements ICalculator {

    public double sqrt(double a) {
        double e = 0.0000000000000001;
        double x0 = a;
        double x1 = 1 / 2.0 * (x0 + a / x0);
        double abs = abs(x1 - x0);
        for (; abs >= 2 * e && abs * abs >= 2 * e; ) {
            x0 = x1;
            x1 = 1 / 2.0 * (x0 + a / x0);
            abs = abs(x1 - x0);
        }
        return x1;
    }

    public double abs(double a) {
        char[] chars = Double.valueOf(a).toString().toCharArray();
        if (chars[0] == '-') {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 1; i < chars.length; i++) {
                stringBuilder.append(chars[i]);
            }
            return Double.parseDouble(stringBuilder.toString());
        } else return a;
    }

    public double pow(double a, double b) {
        double result = 1;
        if (b == 0) {
            return result;
        } else {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
            return result;
        }
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
