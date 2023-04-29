package home_work_2.loops;

import org.w3c.dom.ls.LSOutput;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        while (true) {

            System.out.println("Найти наибольшую цифру натурального числа");
            System.out.println(findMaxDigitOfNumber(getNumber("Ведите число")));

            System.out.println("Вероятность четных случайных чисел");
            System.out.println(getCountRandomNumbers(getNumber("Введите размер выборки")));

            System.out.println("Посчитать четные и нечетные цифры числа");
            countNumberOfDigits(getNumber("Введите число"));

            System.out.println("Ряд Фибоначчи");
            getFibonacciSequence(getNumber("Введите длину ряда Фибоначчи"));

            System.out.println("Вывести ряд чисел в диапазоне с шагом");
            printNubers(getNumber("Введите нижний предел"),
                    getNumber("Введите верхний предел"),
                    getNumber("Введите шаг"));

            System.out.println("Переворот числа");
            System.out.println(getReverseNumber(getNumber("Введите число")));
        }
    }

    /**
     * This method returns a number of Long type entered into the console
     *
     * @param inquiryText - the message that will be displayed in the console
     * @return - a number of Long type
     */
    public static long getNumber(String inquiryText) {
        Scanner scanner = new Scanner(System.in);
        long someLong;


        System.out.println(inquiryText);
        while (true) {
            if (scanner.hasNextLong()) {
                someLong = scanner.nextLong();
                break;

            } else {
                System.out.println(inquiryText);
                scanner.nextLine();
                continue;
            }
        }

        return someLong;
    }

    /**
     * This method finds the max digit in the number
     *
     * @param someNumber - The number in which need to find the max digit
     * @return - max digit in the number
     */
    public static int findMaxDigitOfNumber(long someNumber) {
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
    public static long getCountRandomNumbers(long sampleSize) {
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
     * This method counts how many even and odd digits are in a given number
     *
     * @param givenNumber - given number
     */
    public static void countNumberOfDigits(long givenNumber) {
        long evenDigitCount = 0;
        long oddDigitCount = 0;

        char[] arrayOfDigits = Long.toString(givenNumber).toCharArray();

        for (char arrayOfDigit : arrayOfDigits) {
            if (((Character.getNumericValue(arrayOfDigit)) % 2) == 0) {
                evenDigitCount++;
            } else {
                oddDigitCount++;
            }
        }

        System.out.println("Even digits: " + evenDigitCount);
        System.out.println("Odd digits: " + oddDigitCount);
    }

    /**
     * This method returns the Fibonacci sequence up to the specified number
     *
     * @param upToNumber - number up to
     */
    public static void getFibonacciSequence(long upToNumber) {
        long fibonacciNumber = 2;
        long previousFibonacciNumber = 1;
        String three = "0 " + Long.signum(upToNumber) + " " + Long.signum(upToNumber) +
                " " + 2 * Long.signum(upToNumber) + " ";
        long temp;

        if (upToNumber == 0) {
            System.out.println("0");
        } else if (Math.abs(upToNumber) == 1) {
            System.out.println("0 " + upToNumber);
        } else if (Math.abs(upToNumber) == 2) {
            System.out.println("0 " + Long.signum(upToNumber) + " " + Long.signum(upToNumber));
        } else if (Math.abs(upToNumber) == 3) {
            System.out.println(three);
        } else {
            System.out.print(three);
            for (int i = 2; i < Math.abs(upToNumber) - 1; i++) {
                temp = (previousFibonacciNumber + fibonacciNumber) * Long.signum(upToNumber);
                System.out.print(temp + " ");
                previousFibonacciNumber = fibonacciNumber;
                fibonacciNumber = Math.abs(temp);
            }
            System.out.println();
        }
    }

    /**
     * This method print numbers in a range with a specified step
     *
     * @param lowLimit - low limit
     * @param upLimit  - up limit
     * @param step     - step
     */
    public static void printNubers(long lowLimit, long upLimit, long step) {

        while (true) {
            if ((lowLimit > upLimit) && (step > (upLimit - lowLimit))) {
                System.out.println("Проверьте данные");
                lowLimit = getNumber("Введите нижний предел");
                upLimit = getNumber("Введите верхний предел");
                step = getNumber("Введите шаг");
                continue;
            } else {
                break;
            }
        }

        while (lowLimit < upLimit) {

            System.out.print(lowLimit + " ");
            lowLimit += step;
        }

        System.out.println(upLimit);
    }

    /**
     * this method flips a given number and returns the result
     *
     * @param someNumber - number
     * @return - reversed number
     */
    public static long getReverseNumber(long someNumber) {
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
