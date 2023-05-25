package home_work_2.loops;

import java.util.Scanner;

public class Task1_1 {

    /**
     * This method return the result of multiplying numbers from 1 to the passed number
     * used loop "FOR"
     *
     * @param l - long type number >= 0 and <21
     * @return long type number
     */
    public static long multiplyWithLoop(long l) {
        long result = 1;
        if (l == 0)
            return 1;
        for (long i = 1; i <= l; i++) {
            result *= i;
        }
        return result;
    }

    /**
     * This method return the result of multiplying numbers from 1 to the passed number
     * used recursion method
     *
     * @param l - long type number >= 0 and <21
     * @return long type number
     */
    public static long multiplyWithRecursion(long l) {
        if (l == 0) {
            return 1;
        } else {
            return l * multiplyWithRecursion(l - 1);
        }
    }

}


