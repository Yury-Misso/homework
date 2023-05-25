package home_work_2.loops;

import home_work_1.Task63;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Task1_1Test {

    private static Task1_1 task11 = new Task1_1();

    @Test
    public void multiplyWithLoopTest1() {
        long someLong = 5;
        long actual = 120;
        Assertions.assertEquals(task11.multiplyWithLoop(someLong), actual);
    }

    @Test
    public void multiplyWithLoopTest2() {
        long someLong = 10;
        long actual = 3628800;
        Assertions.assertEquals(task11.multiplyWithLoop(someLong), actual);
    }

    @Test
    public void multiplyWithLoopTest3() {
        long someLong = 5;
        long actual = 120;
        Assertions.assertEquals(task11.multiplyWithRecursion(someLong), actual);
    }

    @Test
    public void multiplyWithLoopTest4() {
        long someLong = 10;
        long actual = 3628800;
        Assertions.assertEquals(task11.multiplyWithRecursion(someLong), actual);
    }
}
