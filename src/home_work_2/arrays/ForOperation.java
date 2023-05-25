package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    @Override
    public int[] printArray(int[] someArr) {
        if (someArr.length == 0) {
            int[] arr = {};
            return arr;
        }
        int[] result = new int[someArr.length];
        for (int i = 0; i < someArr.length; i++) {
            result[i] = someArr[i];
        }
        return result;
    }

    @Override
    public int[] printEverySecondElement(int[] someArr) {
        if (someArr.length == 0) {
            int[] arr = {};
            return arr;
        }
        int iterNewArr = 0;
        for (int i = 0; i < someArr.length; i++) {
            if (i % 2 != 0) {
                iterNewArr++;
            }
        }
        int[] result = new int[iterNewArr];

        iterNewArr = 0;
        for (int i = 0; i < someArr.length; i++) {
            if (i % 2 != 0) {
                result[iterNewArr] = someArr[i];
                iterNewArr++;
            }
        }
        return result;
    }

    @Override
    public int[] printElementsInReverseOrder(int[] someArr) {
        if (someArr.length == 0) {
            int[] arr = {};
            return arr;
        }
        int[] newArr = new int[someArr.length];

        for (int i = 0; i < someArr.length; i++) {
            newArr[i] = someArr[someArr.length - 1 - i];
        }
        return newArr;
    }
}
