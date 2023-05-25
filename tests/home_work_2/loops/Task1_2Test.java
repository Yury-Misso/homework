package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_2Test {

    private static Task1_2 task12 = new Task1_2();

    @Test
    public void isIntTest1() {
        String someString = "123456";

        Assertions.assertTrue(task12.isInt(someString));
    }

    @Test
    public void isIntTest2() {
        String someString = "-123456";

        Assertions.assertFalse(task12.isInt(someString));
    }

    @Test
    public void isIntTest3() {
        String someString = "0";

        Assertions.assertTrue(task12.isInt(someString));
    }

    @Test
    public void isIntTest4() {
        String someString = "2147483647";

        Assertions.assertTrue(task12.isInt(someString));
    }

    @Test
    public void isIntTest5() {
        String someString = "2147483648";

        Assertions.assertFalse(task12.isInt(someString));
    }

    @Test
    public void multiplyAllNumberTest1() {
        int someInt = 0;
        int actual = 0;

        Assertions.assertEquals(task12.multiplyAllNumber(someInt), actual);
    }

    @Test
    public void multiplyAllNumberTest2() {
        int someInt = 3;
        int actual = 3;

        Assertions.assertEquals(task12.multiplyAllNumber(someInt), actual);
    }

    @Test
    public void multiplyAllNumberTest3() {
        int someInt = 11;
        int actual = 1;

        Assertions.assertEquals(task12.multiplyAllNumber(someInt), actual);
    }

    @Test
    public void multiplyAllNumberTest4() {
        int someInt = 181232375;
        int actual = 10080;

        Assertions.assertEquals(task12.multiplyAllNumber(someInt), actual);
    }

    @Test
    public void multiplyAllNumberTest5() {
        int someInt = 455678760;
        int actual = 0;

        Assertions.assertEquals(task12.multiplyAllNumber(someInt), actual);
    }

    @Test
    public void multiplyAllNumberTest6() {
        int someInt = 455678761;
        int actual = 1411200;

        Assertions.assertEquals(task12.multiplyAllNumber(someInt), actual);
    }


}
