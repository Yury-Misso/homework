package home_work_2.loops;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task1_2 {

    public boolean isInt(String s) {
        String regex = "[0-9]*";
        long temp = 0;

        if (s.matches(regex) && s.length() < 14) {
            temp = Long.parseLong(s);
            if ((temp <= Integer.MAX_VALUE) && (temp >= 0)) {
                return true;
            }
        }
        return false;

    }


    /**
     * This method returns multiply of all digits in the number
     *
     * @param someInt - some Integer of numbers
     */
    public long multiplyAllNumber(int someInt) {
        long result = 1;
        char[] charsNumber = String.valueOf(someInt).toCharArray();

        for (int i = 0; i < charsNumber.length; i++) {
            result *= Integer.parseInt(String.valueOf(charsNumber[i]));
        }
        return result;


        //for (int i = 0; i < s.length(); i++) {
        //    number = Integer.parseInt(String.valueOf(s.charAt(i)));
        //    result *= number;
        //    if (result >= 0) {
        //        if (i == (s.length() - 1)) {
        //            System.out.print(number + " = " + new DecimalFormat("###,###").format(result));
        //        } else {
        //            System.out.print(number + " * ");
        //        }
        //    } else {
        //        System.out.println();
        //        System.out.print("Вы ввели слишком длинное число");
        //        break;
        //    }
        //}
        //System.out.println();
    }
}
