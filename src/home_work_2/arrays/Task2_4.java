package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task2_4 {
    public static void main(String[] args) {
        int[] someArrInt = ArraysUtils.arrayRandom(15, 100);

        System.out.println(Arrays.toString(someArrInt));
        sumOfEvenPositiveElements(someArrInt);
        maximumOfElementsInArrayWithEvenIndex(someArrInt);
        getElementsThatSmallerThanArithmeticAverage(someArrInt);
        findTwoSmallestElementsOfArray(someArrInt);
        System.out.println(Arrays.toString(compressArray(someArrInt)));
        System.out.println(sumOfArrayDigits(someArrInt));

    }

    public static void sumOfEvenPositiveElements(int[] someArr) {
        System.out.println("Сумма четных положительных элементов массива");
        int sum = 0;
        for (int i = 0; i < someArr.length; i++) {
            if ((someArr[i] % 2 == 0) && (someArr[i] > 0)) {
                sum += someArr[i];
            }
        }
        System.out.println(sum);
    }

    public static void maximumOfElementsInArrayWithEvenIndex(int[] someArr) {
        System.out.println("Максимальный из элементов массива с четными индексами");
        int max = someArr[0];
        for (int i = 0; i < someArr.length; i++) {
            if (((i + 1) % 2 == 0) && (someArr[i] > max)) {
                max = someArr[i];
            }
        }
        System.out.println(max);
    }

    public static void getElementsThatSmallerThanArithmeticAverage(int[] someArr) {
        System.out.println("Элементы массива, которые меньше среднего арифметического");
        int sum = 0;
        int average = 0;
        for (int j : someArr) {
            sum += j;
        }
        average = sum / someArr.length;
        for (int i = 0; i < someArr.length; i++) {
            if (someArr[i] < average) {
                System.out.print(someArr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void findTwoSmallestElementsOfArray(int[] someArr) {
        System.out.println("Найти два наименьших (минимальных) элемента массива");
        int min1 = someArr[0];
        int min2 = someArr[someArr.length - 1];
        int iterrMin = 0;
        int[] tempArr = Arrays.copyOf(someArr, someArr.length);
        SortsUtils.shake(tempArr);

        System.out.println("min1= " + tempArr[0] + " : min2= " + tempArr[1]);
    }

    public static int[] compressArray(int[] someArr) {
        System.out.println("Сжать массив, удалив элементы, принадлежащие интервалу");
        int lowLimit;
        int upLimit;
        int tempCount = 0;

        while (true) {
            lowLimit = getNumber("Введите нижний предел");
            upLimit = getNumber("Введите верхний предел");
            if (upLimit > lowLimit) {
                break;
            } else {
                System.out.println("Неверные значения");
            }
        }

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

    private static int getNumber(String inquiryText) {
        Scanner scanner = new Scanner(System.in);
        int someInt;


        System.out.println(inquiryText);
        while (true) {
            if (scanner.hasNextInt()) {
                someInt = scanner.nextInt();
                break;

            } else {
                System.out.println(inquiryText);
                scanner.nextLine();
                continue;
            }
        }

        return someInt;
    }

}
