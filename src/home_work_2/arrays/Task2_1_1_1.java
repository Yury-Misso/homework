package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

import java.util.Arrays;

import static home_work_2.utils.ArraysUtils.arrayFromConsole;

public class Task2_1_1_1 {
    public static void main(String[] args) {
        int[] container;
        while (true) {
            container = arrayFromConsole();
            System.out.println(Arrays.toString(container));
        }
    }
}
