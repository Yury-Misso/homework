package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task42Test {


    @Test
    public void getAverageValueShouldReturnAverageTest1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int actual = 1;
        double expected = Task42.getAverageValue(a, b, c);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void getAverageValueShouldReturnAverageTest2() {
        int a = 1;
        int b = 3;
        int c = 1;
        double actual = 1.6666666666666667;
        double expected = Task42.getAverageValue(a, b, c);

        Assertions.assertEquals(expected, actual);
    }
}
