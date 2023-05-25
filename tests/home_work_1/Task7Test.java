package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task7Test {

    @Test
    public void createPhoneNumberTest1() {
        int[] somePhoneNumber = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String actual = "(012) 345-6789";
        Assertions.assertEquals(Task7.createPhoneNumber(somePhoneNumber)
                , actual);
    }

    @Test
    public void createPhoneNumberTest2() {
        int[] somePhoneNumber = {9, 6, 8, 6, 9, 3, 5, 2, 8, 4};
        String actual = "(968) 693-5284";
        Assertions.assertEquals(Task7.createPhoneNumber(somePhoneNumber)
                , actual);
    }
}
