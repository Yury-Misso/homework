package home_work_2.loops;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1_4Test {
    private static Task1_4 task14 = new Task1_4();

    @Test
    public void multiplyToEdgeTest1() {
        long multiplier = 3;
        long actual = 4052555153018976267L;

        Assertions.assertEquals(task14.multiplyToEdge(multiplier), actual);
    }

    @Test
    public void multiplyToEdgeTest2() {
        long multiplier = 188;
        long actual = 1560496482665168896L;

        Assertions.assertEquals(task14.multiplyToEdge(multiplier), actual);
    }

    @Test
    public void multiplyToEdgeTest3() {
        long multiplier = -19;
        long actual = 799006685782884121L;

        Assertions.assertEquals(task14.multiplyToEdge(multiplier), actual);
    }

    @Test
    public void multiplyToEdgeTest4() {
        long multiplier = 100;
        long actual = 1000000000000000000L;

        Assertions.assertEquals(task14.multiplyToEdge(multiplier), actual);
    }

}
