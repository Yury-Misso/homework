package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_3Test {
    private static Task1_3 task13 = new Task1_3();

    @Test
    public void powTest1() {
        double someNumber = 18.0;
        int somePower = 5;
        double actual = 1889568.0;

        Assertions.assertEquals(task13.pow(someNumber,somePower), actual);
    }

    @Test
    public void powTest2() {
        double someNumber = 7.5;
        int somePower = 2;
        double actual = 56.25;

        Assertions.assertEquals(task13.pow(someNumber,somePower), actual);
    }

    @Test
    public void powTest3() {
        double someNumber = 3;
        int somePower = 3;
        double actual = 27;

        Assertions.assertEquals(task13.pow(someNumber,somePower), actual);
    }

    @Test
    public void powTest4() {
        double someNumber = 10;
        int somePower = 2;
        double actual = 100;

        Assertions.assertEquals(task13.pow(someNumber,somePower), actual);
    }
}
