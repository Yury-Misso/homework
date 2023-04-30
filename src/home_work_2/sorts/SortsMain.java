package home_work_2.sorts;

import home_work_2.utils.ArraysUtils;
import home_work_2.utils.SortsUtils;

import java.util.Arrays;

public class SortsMain {
    public static void main(String[] args) {
        System.out.println("Предварительно созданные массивы");
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = new int[]{1, 1, 1, 1};
        int[] arr3 = new int[]{9, 1, 5, 99, 9, 9};
        int[] arr4 = new int[]{};
        int[] arr5 = new int[]{6, 5, 4, 3, 2, 1};

        doTest(arr1);
        doTest(arr2);
        doTest(arr3);
        doTest(arr4);
        doTest(arr5);

        System.out.println("С рандомным заполнением массива");
        doTest(ArraysUtils.arrayRandom(50, 100));

        System.out.println("С массивом полученным через консоль");
        doTest(ArraysUtils.arrayFromConsole());

    }

    private static void doTest(int[] someArr) {
        int[] tempArrSort = getCopyOfArray(someArr);
        int[] tempArrShake = getCopyOfArray(someArr);

        System.out.println("Состояние массива до теста\n1- пузырьковая сортировка\n2- шейкерная сортировка");
        System.out.println(Arrays.toString(tempArrSort));
        System.out.println(Arrays.toString(tempArrShake));

        SortsUtils.sort(tempArrSort);
        SortsUtils.shake(tempArrShake);

        System.out.println("Состояние массива после теста");
        System.out.println(Arrays.toString(tempArrSort));
        System.out.println(Arrays.toString(tempArrShake));

    }


    private static int[] getCopyOfArray(int[] someArr) {
        return Arrays.copyOf(someArr, someArr.length);
    }


}
