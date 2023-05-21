package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;
import home_work_3.calcs.simple.CalculatorWithMathCopy;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        CalculatorStringExpression calculatorStringExpression = new CalculatorStringExpression(new CalculatorWithMathCopy());
//
        //String expression = "2.2 + | - 3 | * 4 ^ 2 + ( ( 3 - 4 ) ^ 4 / 4 ) - Pi + E";
//
        //System.out.println(expression);
        //System.out.println(calculatorStringExpression.tokenize(expression));

       // String expression2 = " ((2 - 3)  * 4)  +  3 - 4 ";
        String expression2 = " (2 - 3)  * (4  +  (3 - 4 ))";
        System.out.println(expression2);
        System.out.println(calculatorStringExpression.calculate(calculatorStringExpression.tokenize(expression2)));

        //System.out.println();
        //String expression3 = " -3";
        //System.out.println(expression3);
        //System.out.println(calculatorStringExpression.calculateSimple(calculatorStringExpression.tokenize(expression3)));
//
        //System.out.println();
        //String expression4 = " 4/2 * 5 /10";
        //System.out.println(expression4);
        //System.out.println(calculatorStringExpression.calculateSimple(calculatorStringExpression.tokenize(expression4)));


    }
}
