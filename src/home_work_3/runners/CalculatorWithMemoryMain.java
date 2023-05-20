package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithMemory;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorWithMemoryMain {
    public static void main(String[] args) {
        CalculatorWithMemory calc = new CalculatorWithMemory(new CalculatorWithMathCopy());

        calc.save();
        System.out.println(calc.load());
        calc.save();
        System.out.println(calc.sum(4.1, calc.sum(calc.multiply(15, 7), calc.pow(calc.divide(28, 5), 2))));
        System.out.println(calc.load());
        System.out.println(calc.load());
    }
}
