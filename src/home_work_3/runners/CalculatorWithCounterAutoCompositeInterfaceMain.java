package home_work_3.runners;


import home_work_3.calcs.additional.CalculatorWithCounterAutoAgregationInterface;
import home_work_3.calcs.simple.CalculatorWithMathCopy;
import home_work_3.calcs.simple.CalculatorWithMathExtends;
import home_work_3.calcs.simple.CalculatorWithOperator;

public class CalculatorWithCounterAutoCompositeInterfaceMain {
    public static void main(String[] args) {

        CalculatorWithCounterAutoAgregationInterface calcO = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithOperator());
        CalculatorWithCounterAutoAgregationInterface calcC = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathCopy());
        CalculatorWithCounterAutoAgregationInterface calcE = new CalculatorWithCounterAutoAgregationInterface(new CalculatorWithMathExtends());

        System.out.println(calcO.getCountOperation());
        System.out.println(calcO.sum(4.1, calcO.sum(calcO.multiply(15, 7), calcO.pow(calcO.divide(28, 5), 2))));
        System.out.println(calcO.getCountOperation());

        System.out.println(calcC.getCountOperation());
        System.out.println(calcC.sum(4.1, calcC.sum(calcC.multiply(15, 7), calcC.pow(calcC.divide(28, 5), 2))));
        System.out.println(calcC.getCountOperation());

        System.out.println(calcE.getCountOperation());
        System.out.println(calcE.sum(4.1, calcE.sum(calcE.multiply(15, 7), calcE.pow(calcE.divide(28, 5), 2))));
        System.out.println(calcE.getCountOperation());
    }
}
