package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterClassic;

public class CalculatorWithCounterClassicMain {
    public static void main(String[] args) {
        CalculatorWithCounterClassic calc = new CalculatorWithCounterClassic();

        System.out.println(calc.getCountOperation());
        System.out.println(calc.sum(4.1, calc.sum(calc.multiply(15, 7), calc.pow(calc.divide(28, 5), 2))));
        System.out.println(calc.getCountOperation());
    }

}
