package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_5Test {

    private static Task1_5 task15 = new Task1_5();

    @Test
    public void findMaxDigitOfNumberTest1() {
        long someNumber = 123456789L;
        long actual = 9;

        Assertions.assertEquals(task15.findMaxDigitOfNumber(someNumber), actual);
    }

    @Test
    public void findMaxDigitOfNumberTest2() {
        long someNumber = 1231231237L;
        long actual = 7;

        Assertions.assertEquals(task15.findMaxDigitOfNumber(someNumber), actual);
    }


    @Test
    public void getCountRandomNumbersTest1() {
        long sampleSize = 1000;
        long actual = (long) (sampleSize * 0.45);

        Assertions.assertTrue(task15.getCountRandomNumbers(sampleSize) > actual);
    }

    @Test
    public void getCountRandomNumbersTest2() {
        long sampleSize = 100000;
        long actual = (long) (sampleSize * 0.45);

        Assertions.assertTrue(task15.getCountRandomNumbers(sampleSize) > actual);
    }

    @Test
    public void countNumberOfDigitsTest1() {
        long givenNumber = 123456789;
        int actual = 4;

        Assertions.assertEquals(task15.countNumberOfDigits(givenNumber), actual);
    }

    @Test
    public void countNumberOfDigitsTest2() {
        long givenNumber = 987654321;
        int actual = 4;

        Assertions.assertEquals(task15.countNumberOfDigits(givenNumber), actual);
    }

    @Test
    public void getFibonacciSequenceTest1() {
        long upToNumber = 0;
        String actual = "0";

        Assertions.assertEquals(task15.getFibonacciSequence(upToNumber), actual);
    }

    @Test
    public void getFibonacciSequenceTest2() {
        long upToNumber = 1;
        String actual = "0 1";

        Assertions.assertEquals(task15.getFibonacciSequence(upToNumber), actual);
    }

    @Test
    public void getFibonacciSequenceTest3() {
        long upToNumber = 2;
        String actual = "0 1 1";

        Assertions.assertEquals(task15.getFibonacciSequence(upToNumber), actual);
    }

    @Test
    public void getFibonacciSequenceTest4() {
        long upToNumber = 3;
        String actual = "0 1 1 2";

        Assertions.assertEquals(task15.getFibonacciSequence(upToNumber), actual);
    }

    @Test
    public void getFibonacciSequenceTest5() {
        long upToNumber = 4;
        String actual = "0 1 1 2 3";

        Assertions.assertEquals(task15.getFibonacciSequence(upToNumber), actual);
    }

    @Test
    public void getFibonacciSequenceTest6() {
        long upToNumber = 5;
        String actual = "0 1 1 2 3 5";

        Assertions.assertEquals(task15.getFibonacciSequence(upToNumber), actual);
    }

    @Test
    public void getFibonacciSequenceTest7() {
        long upToNumber = 10;
        String actual = "0 1 1 2 3 5 8 13 21 34 55";

        Assertions.assertEquals(task15.getFibonacciSequence(upToNumber), actual);
    }

    @Test
    public void printNubersTest1() {
        long lowLimit = 0;
        long upLimit = 10;
        long step = 2;
        String actual = "0 2 4 6 8";

        Assertions.assertEquals(task15.printNubers(lowLimit, upLimit, step), actual);
    }

    @Test
    public void printNubersTest2() {
        long lowLimit = 10;
        long upLimit = 0;
        long step = 2;
        String actual = "";

        Assertions.assertEquals(task15.printNubers(lowLimit, upLimit, step), actual);
    }

    @Test
    public void printNubersTest3() {
        long lowLimit = -10;
        long upLimit = 10;
        long step = 2;
        String actual = "-10 -8 -6 -4 -2 0 2 4 6 8";

        Assertions.assertEquals(task15.printNubers(lowLimit, upLimit, step), actual);
    }

    @Test
    public void getReverseNumberTest1() {
        long someNumber = -10;
        long actual = -1;

        Assertions.assertEquals(task15.getReverseNumber(someNumber), actual);
    }

    @Test
    public void getReverseNumberTest2() {
        long someNumber = -123456789;
        long actual = -987654321;

        Assertions.assertEquals(task15.getReverseNumber(someNumber), actual);
    }
}

