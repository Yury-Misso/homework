package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorWithCounterAutoDecorator;
import home_work_3.calcs.additional.CalculatorWithMemoryDecorator;
import home_work_3.calcs.api.ICalculator;
import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorDecoratorMain {
    public static void main(String[] args) throws NoSuchMethodException {

        ICalculator calc = new CalculatorWithCounterAutoDecorator(new CalculatorWithMemoryDecorator(new CalculatorWithMathExtends()));

        CalculatorWithCounterAutoDecorator cWCAD;
        CalculatorWithMemoryDecorator cWMD;

        cWCAD = ((CalculatorWithCounterAutoDecorator) calc);
        cWMD = (CalculatorWithMemoryDecorator) cWCAD.getCalculator();

        cWMD.save();
        System.out.println(calc.sum(4.1, calc.sum(calc.multiply(15, 7), calc.pow(calc.divide(28, 5), 2))));
        System.out.println(cWCAD.getCountOperation());
        System.out.println(cWMD.load());


    }
}
