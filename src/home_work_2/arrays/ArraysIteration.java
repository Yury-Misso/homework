package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;
import org.w3c.dom.ls.LSOutput;

public class ArraysIteration {
    public static void main(String[] args) {

        int[] someArr = ArraysUtils.arrayFromConsole();

        printArray(someArr);
        System.out.println();

        printEverySecondElement(someArr);
        System.out.println();

        printElementsInReverseOrder(someArr);
        System.out.println();

    }

    public static void printArray(int[] someArr) {
        int iter = 0;

        System.out.println("Ввывод элементов массива:");

        System.out.println("do - while:");
        do {
            System.out.print(someArr[iter] + " ");
            iter++;
        } while (iter < someArr.length);
        System.out.println();

        iter = 0;
        System.out.println("while:");
        while (iter < someArr.length) {
            System.out.print(someArr[iter] + " ");
            iter++;
        }
        System.out.println();

        System.out.println("for:");
        for (int i = 0; i < someArr.length; i++) {
            System.out.print(someArr[i] + " ");
        }
        System.out.println();

        System.out.println("for each:");
        for (int someInt : someArr) {
            System.out.print(someInt + " ");
        }
        System.out.println();
    }

    public static void printEverySecondElement(int[] someArr) {
        int iter = 1;

        System.out.println("Ввывод каждого второго элемента массива:");

        System.out.println("do - while:");
        do {
            if (iter % 2 == 0) {
                System.out.print(someArr[iter - 1] + " ");
            }
            iter++;
        } while (iter <= someArr.length);
        System.out.println();

        iter = 1;
        System.out.println("while:");
        while (iter <= someArr.length) {
            if (iter % 2 == 0) {
                System.out.print(someArr[iter - 1] + " ");
            }
            iter++;
        }
        System.out.println();

        System.out.println("for:");
        for (int i = 1; i <= someArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(someArr[i - 1] + " ");
            }
        }
        System.out.println();

        iter = 1;
        System.out.println("for each:");
        for (int someInt : someArr) {
            if (iter % 2 == 0) {
                System.out.print(someInt + " ");
            }
            iter++;
        }
        System.out.println();
    }

    public static void printElementsInReverseOrder(int[] someArr) {
        int iter = someArr.length - 1;

        System.out.println("Вывести все элементы массива в консоль в обратном порядке");

        System.out.println("do - while:");
        do {
            System.out.print(someArr[iter] + " ");
            iter--;
        } while (iter >= 0);
        System.out.println();

        iter = someArr.length - 1;
        System.out.println("while:");
        while (iter >= 0) {
            System.out.print(someArr[iter] + " ");
            iter--;
        }
        System.out.println();

        System.out.println("for:");
        for (int i = someArr.length - 1; i >= 0; i--) {
            System.out.print(someArr[i] + " ");
        }
        System.out.println();

        iter = someArr.length - 1;
        System.out.println("for each:");
        for (int someInt : someArr) {
            System.out.print(someArr[iter] + " ");
            iter--;
        }
        System.out.println();
    }


}
