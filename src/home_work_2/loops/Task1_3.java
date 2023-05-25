package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_3 {

    public double pow(double number, int powerOfNumber) {
        double result = 0;
        if (powerOfNumber == 0) {
            return 1.0;
        } else {
            result = number;
            for (int i = 1; i < powerOfNumber; i++) {
                result *= number;
            }
            return result;
        }
    }
}
