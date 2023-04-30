package home_work_2.utils;

import java.util.Arrays;

public class SortsUtils {
    public static void sort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void shake(int[] arr) {
        int temp = 0;
        boolean didSwap = true;
        int left = 0;
        int right = arr.length;
        while (didSwap) {
            didSwap = false;
            for (int i = left; i < right - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    didSwap = true;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i - 1] > arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    didSwap = true;
                }
            }
            left++;
        }
    }
}
