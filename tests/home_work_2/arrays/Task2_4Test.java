package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task2_4Test {

    private static int[] arrayForTest1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int[] arrayForTest2 = {};
    private static int[] arrayForTest3 = {1};
    private static int[] arrayForTest4 = {1, 2};
    private static int[] arrayForTest5 = {1, 2, 3};

    @Test
    public void sumOfEvenPositiveElementsTest1() {
        int actualSumOfEvenPositiveElements = 20;
        Assertions.assertEquals(Task2_4.sumOfEvenPositiveElements(arrayForTest1)
                , actualSumOfEvenPositiveElements);
    }

    @Test
    public void sumOfEvenPositiveElementsTest2() {
        int actualSumOfEvenPositiveElements = 0;
        Assertions.assertEquals(Task2_4.sumOfEvenPositiveElements(arrayForTest2)
                , actualSumOfEvenPositiveElements);
    }

    @Test
    public void sumOfEvenPositiveElementsTest3() {
        int actualSumOfEvenPositiveElements = 0;
        Assertions.assertEquals(Task2_4.sumOfEvenPositiveElements(arrayForTest3)
                , actualSumOfEvenPositiveElements);
    }

    @Test
    public void sumOfEvenPositiveElementsTest4() {
        int actualSumOfEvenPositiveElements = 2;
        Assertions.assertEquals(Task2_4.sumOfEvenPositiveElements(arrayForTest4)
                , actualSumOfEvenPositiveElements);
    }

    @Test
    public void sumOfEvenPositiveElementsTest5() {
        int actualSumOfEvenPositiveElements = 2;
        Assertions.assertEquals(Task2_4.sumOfEvenPositiveElements(arrayForTest5)
                , actualSumOfEvenPositiveElements);
    }

    @Test
    public void maximumOfElementsInArrayWithEvenIndexTest1() {
        int actualMaximumOfElementsInArrayWithEvenIndex = 8;
        Assertions.assertEquals(Task2_4.maximumOfElementsInArrayWithEvenIndex(arrayForTest1)
                , actualMaximumOfElementsInArrayWithEvenIndex);
    }

    @Test
    public void maximumOfElementsInArrayWithEvenIndexTest2() {
        int actualMaximumOfElementsInArrayWithEvenIndex = 0;
        Assertions.assertEquals(Task2_4.maximumOfElementsInArrayWithEvenIndex(arrayForTest2)
                , actualMaximumOfElementsInArrayWithEvenIndex);
    }

    @Test
    public void maximumOfElementsInArrayWithEvenIndexTest3() {
        int actualMaximumOfElementsInArrayWithEvenIndex = 0;
        Assertions.assertEquals(Task2_4.maximumOfElementsInArrayWithEvenIndex(arrayForTest3)
                , actualMaximumOfElementsInArrayWithEvenIndex);
    }

    @Test
    public void maximumOfElementsInArrayWithEvenIndexTest4() {
        int actualMaximumOfElementsInArrayWithEvenIndex = 2;
        Assertions.assertEquals(Task2_4.maximumOfElementsInArrayWithEvenIndex(arrayForTest4)
                , actualMaximumOfElementsInArrayWithEvenIndex);
    }

    @Test
    public void maximumOfElementsInArrayWithEvenIndexTest5() {
        int actualMaximumOfElementsInArrayWithEvenIndex = 2;
        Assertions.assertEquals(Task2_4.maximumOfElementsInArrayWithEvenIndex(arrayForTest5)
                , actualMaximumOfElementsInArrayWithEvenIndex);
    }

    @Test
    public void getElementsThatSmallerThanArithmeticAverageTest1() {
        int[] actual = {1, 2, 3, 4};
        Assertions.assertArrayEquals(
                Task2_4.getElementsThatSmallerThanArithmeticAverage(arrayForTest1)
                , actual);
    }

    @Test
    public void getElementsThatSmallerThanArithmeticAverageTest2() {
        int[] actual = {};
        Assertions.assertArrayEquals(
                Task2_4.getElementsThatSmallerThanArithmeticAverage(arrayForTest2)
                , actual);
    }

    @Test
    public void getElementsThatSmallerThanArithmeticAverageTest3() {
        int[] actual = {};
        Assertions.assertArrayEquals(
                Task2_4.getElementsThatSmallerThanArithmeticAverage(arrayForTest3)
                , actual);
    }

    @Test
    public void getElementsThatSmallerThanArithmeticAverageTest4() {
        int[] actual = {1};
        Assertions.assertArrayEquals(
                Task2_4.getElementsThatSmallerThanArithmeticAverage(arrayForTest4)
                , actual);
    }

    @Test
    public void getElementsThatSmallerThanArithmeticAverageTest5() {
        int[] actual = {1};
        Assertions.assertArrayEquals(
                Task2_4.getElementsThatSmallerThanArithmeticAverage(arrayForTest5)
                , actual);
    }

    @Test
    public void findTwoSmallestElementsOfArrayTest1() {
        int[] actual = {1, 2};
        Assertions.assertArrayEquals(
                Task2_4.findTwoSmallestElementsOfArray(arrayForTest1)
                , actual);
    }

    @Test
    public void findTwoSmallestElementsOfArrayTest2() {
        int[] actual = {};
        Assertions.assertArrayEquals(
                Task2_4.findTwoSmallestElementsOfArray(arrayForTest2)
                , actual);
    }

    @Test
    public void findTwoSmallestElementsOfArrayTest3() {
        int[] actual = {1};
        Assertions.assertArrayEquals(
                Task2_4.findTwoSmallestElementsOfArray(arrayForTest3)
                , actual);
    }

    @Test
    public void findTwoSmallestElementsOfArrayTest4() {
        int[] actual = {1, 2};
        Assertions.assertArrayEquals(
                Task2_4.findTwoSmallestElementsOfArray(arrayForTest4)
                , actual);
    }

    @Test
    public void findTwoSmallestElementsOfArrayTest5() {
        int[] actual = {1, 2};
        Assertions.assertArrayEquals(
                Task2_4.findTwoSmallestElementsOfArray(arrayForTest5)
                , actual);
    }

    @Test
    public void compressArrayTest1() {
        int[] actual = {3, 4, 5, 6, 7, 8, 9};
        int lowLimit = 0;
        int upLimit = 2;
        Assertions.assertArrayEquals(
                Task2_4.compressArray(arrayForTest1, lowLimit, upLimit)
                , actual);
    }

    @Test
    public void compressArrayTest2() {
        int[] actual = {};
        int lowLimit = 0;
        int upLimit = 2;
        Assertions.assertArrayEquals(
                Task2_4.compressArray(arrayForTest2, lowLimit, upLimit)
                , actual);
    }

    @Test
    public void compressArrayTest3() {
        int[] actual = {};
        int lowLimit = 0;
        int upLimit = 2;
        Assertions.assertArrayEquals(
                Task2_4.compressArray(arrayForTest3, lowLimit, upLimit)
                , actual);
    }

    @Test
    public void compressArrayTest4() {
        int[] actual = {};
        int lowLimit = 0;
        int upLimit = 2;
        Assertions.assertArrayEquals(
                Task2_4.compressArray(arrayForTest4, lowLimit, upLimit)
                , actual);
    }

    @Test
    public void compressArrayTest5() {
        int[] actual = {3};
        int lowLimit = 0;
        int upLimit = 2;
        Assertions.assertArrayEquals(
                Task2_4.compressArray(arrayForTest5, lowLimit, upLimit)
                , actual);
    }

    @Test
    public void sumOfArrayDigitsTest1() {
        int actualSum = 45;
        Assertions.assertEquals(
                Task2_4.sumOfArrayDigits(arrayForTest1)
                , actualSum);
    }

    @Test
    public void sumOfArrayDigitsTest2() {
        int actualSum = 0;
        Assertions.assertEquals(
                Task2_4.sumOfArrayDigits(arrayForTest2)
                , actualSum);
    }

    @Test
    public void sumOfArrayDigitsTest3() {
        int actualSum = 1;
        Assertions.assertEquals(
                Task2_4.sumOfArrayDigits(arrayForTest3)
                , actualSum);
    }

    @Test
    public void sumOfArrayDigitsTest4() {
        int actualSum = 3;
        Assertions.assertEquals(
                Task2_4.sumOfArrayDigits(arrayForTest4)
                , actualSum);
    }

    @Test
    public void sumOfArrayDigitsTest5() {
        int actualSum = 6;
        Assertions.assertEquals(
                Task2_4.sumOfArrayDigits(arrayForTest5)
                , actualSum);
    }
}
