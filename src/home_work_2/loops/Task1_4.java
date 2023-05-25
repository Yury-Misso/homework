package home_work_2.loops;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_4 {


    public long multiplyToEdge(long multiplier) {
        long result = 1L;
        while (true) {
            try {
                result = Math.multiplyExact(result, multiplier);
            } catch (Exception e) {
                break;
            }
        }
        return result;
    }

}
