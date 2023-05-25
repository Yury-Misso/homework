package home_work_2.arrays;

import java.util.Arrays;

public class DoWhileOperation implements IArraysOperation {

    @Override
    public int[] printArray(int[] someArr) {
        if (someArr.length == 0) {
            int[] arr = {};
            return arr;
        }
        int iter = 0;
        int[] result = new int[someArr.length];

        do {
            result[iter] = someArr[iter];
            iter++;
        } while (iter < someArr.length);
        return result;
    }

    @Override
    public int[] printEverySecondElement(int[] someArr) {
        if (someArr.length == 0) {
            int[] arr = {};
            return arr;
        }
        int iter = 1;
        int iterNewArr = 0;
        do {
            if (iter % 2 == 0) {
                iterNewArr++;
            }
            iter++;
        } while (iter <= someArr.length);

        int[] result = new int[iterNewArr];

        iter = 0;
        iterNewArr = 0;
        do {
            if (iter % 2 != 0) {
                result[iterNewArr] = someArr[iter];
                iterNewArr++;
            }
            iter++;
        } while (iter < someArr.length);
        return result;
    }

    @Override
    public int[] printElementsInReverseOrder(int[] someArr) {
        if (someArr.length == 0) {
            int[] arr = {};
            return arr;
        }
        int iter = someArr.length - 1;
        int[] newArr = new int[someArr.length];

        do {
            newArr[someArr.length - 1 - iter] = someArr[iter];
            iter--;
        } while (iter >= 0);
        return newArr;
    }
}
