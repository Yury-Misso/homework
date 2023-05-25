package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public int[] printArray(int[] someArr) {
        if (someArr.length == 0) {
            int[] arr = {};
            return arr;
        }
        int[] result = new int[someArr.length];
        int iter = 0;
        for (int someInt : someArr) {
            result[iter] = someInt;
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

        int iter = 0;
        int iterNewArr = 0;
        for (int someInt : someArr) {
            if (iter % 2 != 0) {
                iterNewArr++;
            }
            iter++;
        }

        int[] result = new int[iterNewArr];
        iter = 0;
        iterNewArr = 0;
        for (int someInt : someArr) {
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
        int iterNewArr = 0;
        int[] newArr = new int[someArr.length];

        for (int someInt : someArr) {
            newArr[iterNewArr] = someArr[iter];
            iter--;
            iterNewArr++;
        }
        return newArr;
    }
}
