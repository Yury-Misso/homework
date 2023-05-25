package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task45Test {

    @Test
    public void isLetterTest1() {
        String someString = "zkdfvbhjsdbvfakKJBGJUFYTDdlfvm";
        boolean actual = true;

        Assertions.assertTrue(Task45.isLetter(someString));
    }

    @Test
    public void isLetterTest2() {
        String someString = "zkdfvbhdsf435346?>>?+_)+()()&$$#jsdbvfakKJBGJUFYTDdlfvm";
        boolean actual = false;

        Assertions.assertFalse(Task45.isLetter(someString));
    }
}
