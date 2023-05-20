package home_work_3.runners;

import home_work_3.calcs.additional.CalculatorStringExpression;

import java.util.Scanner;

public class CalculatorStringExpressionMain {
    public static void main(String[] args) {
        CalculatorStringExpression calculatorStringExpression = new CalculatorStringExpression();

        String expression = "2.2 + | -3 | * 4 ^ 2 + ( ( 3 - 4 ) / 4 ) - Pi + E";

        System.out.println(calculatorStringExpression.tokenize(expression));
    }
}
