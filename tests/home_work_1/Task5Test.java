package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task5Test {

    @Test
    public void sleepInTest1() {
        boolean weekday = false;
        boolean vacation = true;
        boolean actual = true;

        Assertions.assertTrue(Task5.sleepIn(weekday, vacation));
    }

    @Test
    public void sleepInTest2() {
        boolean weekday = true;
        boolean vacation = true;
        boolean actual = true;

        Assertions.assertTrue(Task5.sleepIn(weekday, vacation));
    }

    @Test
    public void sleepInTest3() {
        boolean weekday = false;
        boolean vacation = false;
        boolean actual = true;

        Assertions.assertTrue(Task5.sleepIn(weekday, vacation));
    }

    @Test
    public void sleepInTest4() {
        boolean weekday = true;
        boolean vacation = false;
        boolean actual = false;

        Assertions.assertFalse(Task5.sleepIn(weekday, vacation));
    }
}
