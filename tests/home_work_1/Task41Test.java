package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Task41Test {

    private static Task41 task41;

    @BeforeAll
    public static void createFields() {
        task41 = new Task41();
    }


    @Test
    public void evenNumberShouldEven() {
        int evenNumberTest = 48; //Even number test

        Assertions.assertTrue(task41.isEven(evenNumberTest));
    }

    @Test
    public void oddNumberShouldOdd() {
        int oddNumber = 73; //Odd number for test

        Assertions.assertFalse(task41.isEven(oddNumber));
    }

}
