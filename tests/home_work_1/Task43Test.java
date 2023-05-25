package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task43Test {

    @Test
    public void shouldDivide() {
        int a = 4;
        int b = 2;

        Assertions.assertTrue(Task43.isDivide(a, b));
    }

    @Test
    public void shouldNotDivide() {
        int a = 2;
        int b = 4;

        Assertions.assertFalse(Task43.isDivide(a, b));
    }

    @Test
    public void shouldNotDivideByZero() {
        int a = 4;
        int b = 0;

        Assertions.assertFalse(Task43.isDivide(a, b));
    }

}

