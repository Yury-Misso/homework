package home_work_2.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WhileOperationTest {

    private static WhileOperation whileOperation = new WhileOperation();
    private static int[] arrayForTestt1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    private static int[] arrayForTestt2 = {};
    private static int[] arrayForTestt3 = {1};
    private static int[] arrayForTestt4 = {1, 2};
    private static int[] arrayForTestt5 = {1, 2, 3};

    @Test
    public void printArrayTest1() {
        Assertions.assertArrayEquals(whileOperation.printArray(arrayForTestt1)
                , arrayForTestt1);
    }

    @Test
    public void printArrayTest2() {
        Assertions.assertArrayEquals(whileOperation.printArray(arrayForTestt2)
                , arrayForTestt2);
    }

    @Test
    public void printArrayTest3() {
        Assertions.assertArrayEquals(whileOperation.printArray(arrayForTestt3)
                , arrayForTestt3);
    }

    @Test
    public void printArrayTest4() {
        Assertions.assertArrayEquals(whileOperation.printArray(arrayForTestt4)
                , arrayForTestt4);
    }

    @Test
    public void printArrayTest5() {
        Assertions.assertArrayEquals(whileOperation.printArray(arrayForTestt5)
                , arrayForTestt5);
    }

    @Test
    public void printEverySecondElementTest1() {
        int[] actual = {2, 4, 6, 8};
        Assertions.assertArrayEquals(whileOperation.printEverySecondElement(arrayForTestt1)
                , actual);
    }

    @Test
    public void printEverySecondElementTest2() {
        int[] actual = {};
        Assertions.assertArrayEquals(whileOperation.printEverySecondElement(arrayForTestt2)
                , actual);
    }

    @Test
    public void printEverySecondElementTest3() {
        int[] actual = {};
        Assertions.assertArrayEquals(whileOperation.printEverySecondElement(arrayForTestt3)
                , actual);
    }

    @Test
    public void printEverySecondElementTest4() {
        int[] actual = {2};
        Assertions.assertArrayEquals(whileOperation.printEverySecondElement(arrayForTestt4)
                , actual);
    }

    @Test
    public void printEverySecondElementTest5() {
        int[] actual = {2};
        Assertions.assertArrayEquals(whileOperation.printEverySecondElement(arrayForTestt5)
                , actual);
    }

    @Test
    public void printElementsInReverseOrderTest1() {
        int[] actual = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assertions.assertArrayEquals(whileOperation.printElementsInReverseOrder(arrayForTestt1)
                , actual);
    }

    @Test
    public void printElementsInReverseOrderTest2() {
        int[] actual = {};
        Assertions.assertArrayEquals(whileOperation.printElementsInReverseOrder(arrayForTestt2)
                , actual);
    }

    @Test
    public void printElementsInReverseOrderTest3() {
        int[] actual = {1};
        Assertions.assertArrayEquals(whileOperation.printElementsInReverseOrder(arrayForTestt3)
                , actual);
    }

    @Test
    public void printElementsInReverseOrderTest4() {
        int[] actual = {2,1};
        Assertions.assertArrayEquals(whileOperation.printElementsInReverseOrder(arrayForTestt4)
                , actual);
    }

    @Test
    public void printElementsInReverseOrderTest5() {
        int[] actual = {3, 2, 1};
        Assertions.assertArrayEquals(whileOperation.printElementsInReverseOrder(arrayForTestt5)
                , actual);
    }
}
