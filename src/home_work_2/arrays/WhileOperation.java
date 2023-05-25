package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    @Override
    public int[] printArray(int[] someArr) {
        if (someArr.length == 0) {
            int[] arr = {};
            return arr;
        }
        int iter = 0;
        int[] result = new int[someArr.length];
        while (iter < someArr.length) {
            result[iter] = someArr[iter];
            iter++;
        }
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
        while (iter <= someArr.length) {
            if (iter % 2 == 0) {
                iterNewArr++;
            }
            iter++;
        }

        int[] result = new int[iterNewArr];

        iter = 0;
        iterNewArr = 0;

        while (iter < someArr.length) {
            if (iter % 2 != 0) {
                result[iterNewArr] = someArr[iter];
                iterNewArr++;
            }
            iter++;
        }
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

        while (iter >= 0) {
            newArr[someArr.length - 1 - iter] = someArr[iter];
            iter--;
        }
        return newArr;
    }
}
