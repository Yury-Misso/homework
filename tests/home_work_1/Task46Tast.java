package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task46Tast {

    @Test
    public void isLeapYearTest1() {
        String someStringYear = "0";
        boolean actual = true;

        Assertions.assertTrue(Task46.isLeapYear(someStringYear));
    }

    @Test
    public void isLeapYearTest2() {
        String someStringYear = "1";
        boolean actual = false;

        Assertions.assertFalse(Task46.isLeapYear(someStringYear));
    }

    @Test
    public void isLeapYearTest3() {
        String someStringYear = "10000";
        boolean actual = true;

        Assertions.assertFalse(Task46.isLeapYear(someStringYear));
    }

    @Test
    public void isLeapYearTest4() {
        String someStringYear = "-1000";
        boolean actual = true;

        Assertions.assertFalse(Task46.isLeapYear(someStringYear));
    }

    @Test
    public void isLeapYearTest5() {
        String someStringYear = "4";
        boolean actual = true;

        Assertions.assertTrue(Task46.isLeapYear(someStringYear));
    }
}
