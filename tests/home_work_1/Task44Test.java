package home_work_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task44Test {

    @Test
    public void convertToKBTest1() throws Exception {
        int someBytes = 8;
        double actual = 0.0078125;

        Assertions.assertEquals(Task44.convertToKB(someBytes), actual);
    }

    @Test
    public void convertToKBTest2() throws Exception {
        int someBytes = 1024;
        double actual = 1;

        Assertions.assertEquals(Task44.convertToKB(someBytes), actual);
    }

    @Test
    public void convertToKBTest3() throws Exception {
        int someBytes = 0;
        double actual = 0;

        Assertions.assertEquals(Task44.convertToKB(someBytes), actual);
    }

    @Test
    public void convertToKBTest4() throws Exception {
        int someBytes = -8;
        double actual = 0; //throw new Exception("bytes should be >= 0 && %8=0");

        Assertions.assertEquals("bytes should be >= 0 && %8=0", Assertions.assertThrows(Exception.class
                , () -> Task44.convertToKB(someBytes)).getMessage());

    }

    @Test
    public void convertToKBTest5() throws Exception {
        int someBytes = 9;
        double actual = 0; //throw new Exception("bytes should be >= 0 && %8=0");

        Assertions.assertEquals("bytes should be >= 0 && %8=0", Assertions.assertThrows(Exception.class
                , () -> Task44.convertToKB(someBytes)).getMessage());

    }

    @Test
    public void convertToBytesTest1() throws Exception {
        double someKBytes = 24.4;
        int actual = 24992;

        Assertions.assertEquals(Task44.convertToBytes(someKBytes), actual);
    }

    @Test
    public void convertToBytesTest2() throws Exception {
        double someKBytes = 0;
        double actual = 0;

        Assertions.assertEquals(Task44.convertToBytes(someKBytes), actual);
    }

    @Test
    public void convertToBytesTest3() throws Exception {
        double someKBytes = 1;
        double actual = 1024;

        Assertions.assertEquals(Task44.convertToBytes(someKBytes), actual);
    }

    @Test
    public void convertToBytesTest4() throws Exception {
        int someBytes = -8;
        double actual = 0; //throw new Exception("bytes should be >= 0 && %8=0");

        Assertions.assertEquals("Kbytes should be >= 0", Assertions.assertThrows(Exception.class
                , () -> Task44.convertToBytes(someBytes)).getMessage());

    }

}
