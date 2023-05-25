package home_work_2.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SortsUtilsTest {
    private static int[] arrayForTest1 = {};
    private static int[] arrayForTest2 = {0};
    private static int[] arrayForTest3 = {1, 0, 1};
    private static int[] arrayForTest4 = {-1, 0, 1, -2};
    private static int[] arrayForTest5 = {6, 7, 32, 9, 1, 0, 5, 8, 3, 9, 2};

    @Test
    public void sortTest1() {
        int[] actual = {};
        int[] copyArr = Arrays.copyOf(arrayForTest1, arrayForTest1.length);
        SortsUtils.sort(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void sortTest2() {
        int[] actual = {0};
        int[] copyArr = Arrays.copyOf(arrayForTest2, arrayForTest2.length);
        SortsUtils.sort(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void sortTest3() {
        int[] actual = {0, 1, 1};
        int[] copyArr = Arrays.copyOf(arrayForTest3, arrayForTest3.length);
        SortsUtils.sort(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void sortTest4() {
        int[] actual = {-2, -1, 0, 1};
        int[] copyArr = Arrays.copyOf(arrayForTest4, arrayForTest4.length);
        SortsUtils.sort(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void sortTest5() {
        int[] actual = {0, 1, 2, 3, 5, 6, 7, 8, 9, 9, 32};
        int[] copyArr = Arrays.copyOf(arrayForTest5, arrayForTest5.length);
        SortsUtils.sort(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void shakeTest1() {
        int[] actual = {};
        int[] copyArr = Arrays.copyOf(arrayForTest1, arrayForTest1.length);
        SortsUtils.shake(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void shakeTest2() {
        int[] actual = {0};
        int[] copyArr = Arrays.copyOf(arrayForTest2, arrayForTest2.length);
        SortsUtils.shake(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void shakeTest3() {
        int[] actual = {0, 1, 1};
        int[] copyArr = Arrays.copyOf(arrayForTest3, arrayForTest3.length);
        SortsUtils.shake(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void shakeTest4() {
        int[] actual = {-2, -1, 0, 1};
        int[] copyArr = Arrays.copyOf(arrayForTest4, arrayForTest4.length);
        SortsUtils.shake(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }

    @Test
    public void shakeTest5() {
        int[] actual = {0, 1, 2, 3, 5, 6, 7, 8, 9, 9, 32};
        int[] copyArr = Arrays.copyOf(arrayForTest5, arrayForTest5.length);
        SortsUtils.shake(copyArr);
        Assertions.assertArrayEquals(copyArr, actual);
    }
}
