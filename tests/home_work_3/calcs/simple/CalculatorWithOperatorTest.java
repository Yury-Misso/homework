package home_work_3.calcs.simple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorWithOperatorTest {

    private static CalculatorWithOperator calc = new CalculatorWithMathExtends();

    @Test
    public void sqrtTest1() {
        double number = 4;
        double actualResult = 2;
        Assertions.assertEquals(calc.sqrt(number), actualResult);
    }

    @Test
    public void sqrtTest2() {
        double number = 9;
        double actualResult = 3;
        Assertions.assertEquals(calc.sqrt(number), actualResult);
    }

    @Test
    public void sqrtTest3() {
        double number = 16;
        double actualResult = 4;
        Assertions.assertEquals(calc.sqrt(number), actualResult);
    }

    @Test
    public void absTest1() {
        double number = 0 - 16;
        double actualResult = 16;
        Assertions.assertEquals(calc.abs(number), actualResult);
    }

    @Test
    public void absTest2() {
        double number = 0;
        double actualResult = 0;
        Assertions.assertEquals(calc.abs(number), actualResult);
    }

    @Test
    public void absTest3() {
        double number = 2;
        double actualResult = 2;
        Assertions.assertEquals(calc.abs(number), actualResult);
    }

    @Test
    public void powTest1() {
        double number = 2;
        int power = 3;
        double actualResult = 8;
        Assertions.assertEquals(calc.pow(number, power), actualResult);
    }

    @Test
    public void powTest2() {
        double number = 3;
        int power = 3;
        double actualResult = 27;
        Assertions.assertEquals(calc.pow(number, power), actualResult);
    }

    @Test
    public void powTest3() {
        double number = 0;
        int power = 3;
        double actualResult = 0;
        Assertions.assertEquals(calc.pow(number, power), actualResult);
    }

    @Test
    public void divideTest1() {
        double firstNumber = 16;
        double secondNumber = 8;
        double actualResult = firstNumber / secondNumber;
        Assertions.assertEquals(calc.divide(firstNumber, secondNumber), actualResult);
    }

    @Test
    public void divideTest2() {
        double firstNumber = 16;
        double secondNumber = 0;
        double actualResult = firstNumber / secondNumber;
        Assertions.assertEquals("Divide by zero"
                , Assertions.assertThrows(Exception.class
                        , () -> calc.divide(firstNumber, secondNumber)).getMessage());
    }

    @Test
    public void multiplyTest1() {
        double firstNumber = 16;
        double secondNumber = 0;
        double actualResult = firstNumber * secondNumber;
        Assertions.assertEquals(calc.multiply(firstNumber, secondNumber), actualResult);
    }

    @Test
    public void multiplyTest2() {
        double firstNumber = 16;
        double secondNumber = 16;
        double actualResult = firstNumber * secondNumber;
        Assertions.assertEquals(calc.multiply(firstNumber, secondNumber), actualResult);
    }

    @Test
    public void minusTest1() {
        double firstNumber = -16;
        double secondNumber = -0;
        double actualResult = firstNumber - secondNumber;
        Assertions.assertEquals(calc.minus(firstNumber, secondNumber), actualResult);
    }

    @Test
    public void sumTest1() {
        double firstNumber = -16;
        double secondNumber = -16;
        double actualResult = firstNumber + secondNumber;
        Assertions.assertEquals(calc.sum(firstNumber, secondNumber), actualResult);
    }
}
