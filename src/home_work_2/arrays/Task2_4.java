package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        int[] someArrInt = ArraysUtils.arrayRandom(15, 100);

        System.out.println(Arrays.toString(someArrInt));

        System.out.println("Сумма четных положительных элементов массива");
        System.out.println(sumOfEvenPositiveElements(someArrInt));

        System.out.println("Максимальный из элементов массива с четными индексами");
        System.out.println(maximumOfElementsInArrayWithEvenIndex(someArrInt));

        System.out.println("Элементы массива, которые меньше среднего арифметического");
        System.out.println(Arrays.toString(getElementsThatSmallerThanArithmeticAverage(someArrInt)));

        System.out.println("Найти два наименьших (минимальных) элемента массива");
        int[] result = findTwoSmallestElementsOfArray(someArrInt);
        System.out.println(result[0] + " " + result[1]);

        System.out.println("Сжать массив, удалив элементы, принадлежащие интервалу");
        System.out.println(Arrays.toString(compressArray(someArrInt, 2, 10)));

        System.out.println("Сумма цифр чисел в массиве");
        System.out.println(sumOfArrayDigits(someArrInt));

    }

    public static int sumOfEvenPositiveElements(int[] someArr) {

        int sum = 0;
        for (int i = 0; i < someArr.length; i++) {
            if ((someArr[i] % 2 == 0) && (someArr[i] > 0)) {
                sum += someArr[i];
            }
        }
        return sum;
    }

    public static int maximumOfElementsInArrayWithEvenIndex(int[] someArr) {
        if (someArr.length < 2) {
            return 0;
        }
        int max = someArr[1];
        for (int i = 0; i < someArr.length; i++) {
            if ((i % 2 != 0) && (someArr[i] > max)) {
                max = someArr[i];
            }
        }
        return max;
    }

    public static int[] getElementsThatSmallerThanArithmeticAverage(int[] someArr) {
        if (someArr.length < 2) {
            return new int[]{};
        }
        int sum = 0;
        double average = 0;
        int iter = 0;

        for (int j : someArr) {
            sum += j;
        }

        average = (double) sum / someArr.length;

        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i] < average) {
                iter++;
            }
        }

        int[] newArr = new int[iter];

        int j = 0;
        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i] < average) {
                newArr[j] = someArr[i];
                j++;
            }
        }
        return newArr;
    }

    public static int[] findTwoSmallestElementsOfArray(int[] someArr) {
        if (someArr.length == 0) {
            return new int[]{};
        }
        int min1 = someArr[0];
        int min2 = someArr[someArr.length - 1];
        int iterrMin = 0;
        int[] tempArr = Arrays.copyOf(someArr, someArr.length);
        SortsUtils.shake(tempArr);

        if (someArr.length == 1) {
            return tempArr;
        }

        return new int[]{tempArr[0], tempArr[1]};
    }

    public static int[] compressArray(int[] someArr, int lowLimit, int upLimit) {
        int tempCount = 0;

        for (int currentInt : someArr) {
            if ((currentInt > upLimit) || (currentInt < lowLimit)) {
                tempCount++;
            }
        }

        int[] tempArr = new int[tempCount];
        tempCount = 0;

        for (int currentInt : someArr) {
            if ((currentInt > upLimit) || (currentInt < lowLimit)) {
                tempArr[tempCount] = currentInt;
                tempCount++;
            }
        }

        return tempArr;
    }

    public static int sumOfArrayDigits(int[] someArr) {
        int sum = 0;
        char[] currentIntCharArr;

        for (int currentInt : someArr) {
            currentIntCharArr = Integer.toString(currentInt).toCharArray();
            for (char ch : currentIntCharArr) {
                sum += Character.getNumericValue(ch);
            }
        }

        return sum;
    }


}
