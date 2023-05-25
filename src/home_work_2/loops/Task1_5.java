package home_work_2.loops;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1_5 {

    /**
     * This method finds the max digit in the number
     *
     * @param someNumber - The number in which need to find the max digit
     * @return - max digit in the number
     */
    public int findMaxDigitOfNumber(long someNumber) {
        char max = 0;
        char[] arrayOfDigits = Long.toString(someNumber).toCharArray();

        for (char arrayOfDigit : arrayOfDigits) {
            if (arrayOfDigit > max) {
                max = arrayOfDigit;
            }
        }

        return Character.getNumericValue(max);
    }

    /**
     * This method counts how many even numbers Random has generated on a given sample
     *
     * @param sampleSize - sample size
     * @return - number of even numbers
     */
    public long getCountRandomNumbers(long sampleSize) {
        long count = 0;
        int randomInt;
        Random random = new Random();

        for (long i = 0; i < sampleSize; i++) {
            randomInt = random.nextInt();

            if ((randomInt % 2) == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * This method counts how many even digits are in a given number
     *
     * @param givenNumber - given number
     */
    public int countNumberOfDigits(long givenNumber) {
        int evenDigitCount = 0;


        char[] arrayOfDigits = Long.toString(givenNumber).toCharArray();

        for (char arrayOfDigit : arrayOfDigits) {
            if (((Character.getNumericValue(arrayOfDigit)) % 2) == 0) {
                evenDigitCount++;
            }
        }

        return evenDigitCount;
    }

    /**
     * This method returns the Fibonacci sequence up to the specified number
     *
     * @param upToNumber - number up to
     */
    public String getFibonacciSequence(long upToNumber) {
        StringBuilder fibonacciNumberStringResult = new StringBuilder();
        long fibonacciNumber = 2;
        long previousFibonacciNumber = 1;
        String three = "0 " + Long.signum(upToNumber) + " " + Long.signum(upToNumber) +
                " " + 2 * Long.signum(upToNumber);
        long temp;

        if (upToNumber == 0) {
            return "0";
        } else if (Math.abs(upToNumber) == 1) {
            return "0 " + upToNumber;
        } else if (Math.abs(upToNumber) == 2) {
            return "0 " + Long.signum(upToNumber) + " " + Long.signum(upToNumber);
        } else if (Math.abs(upToNumber) == 3) {
            return three;
        } else {
            fibonacciNumberStringResult.append(three);
            fibonacciNumberStringResult.append(" ");
            for (int i = 2; i < Math.abs(upToNumber) - 1; i++) {
                temp = (previousFibonacciNumber + fibonacciNumber) * Long.signum(upToNumber);
                fibonacciNumberStringResult.append(temp);
                previousFibonacciNumber = fibonacciNumber;
                fibonacciNumber = Math.abs(temp);
                if (i != (Math.abs(upToNumber) - 2)) {
                    fibonacciNumberStringResult.append(" ");
                }

            }
            return fibonacciNumberStringResult.toString();
        }

    }

    /**
     * This method print numbers in a range with a specified step
     *
     * @param lowLimit - low limit
     * @param upLimit  - up limit
     * @param step     - step
     */
    public String printNubers(long lowLimit, long upLimit, long step) {
        StringBuilder stringBuilder = new StringBuilder();

        if ((lowLimit < upLimit) && (step < upLimit - lowLimit)) {

            while (lowLimit < upLimit) {
                stringBuilder.append(lowLimit);
                lowLimit += step;
                if (lowLimit < upLimit) {
                    stringBuilder.append(" ");
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * this method flips a given number and returns the result
     *
     * @param someNumber - number
     * @return - reversed number
     */
    public long getReverseNumber(long someNumber) {
        char[] digitOfNumber = Long.toString(Math.abs(someNumber)).toCharArray();
        int signNumber = Long.signum(someNumber);
        StringBuilder sNumberReverse = new StringBuilder();
        long reversedNumber;

        for (int i = digitOfNumber.length - 1; i >= 0; i--) {
            sNumberReverse.append(digitOfNumber[i]);
        }

        reversedNumber = Long.parseLong(sNumberReverse.toString());

        return reversedNumber * signNumber;
    }


}
