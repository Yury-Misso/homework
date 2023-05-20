package home_work_2.arrays;

public class DoWhileOperation implements IArraysOperation {
    @Override
    public void printArray(int[] someArr) {
        int iter = 0;

        System.out.println("Ввывод элементов массива:");

        do {
            System.out.print(someArr[iter] + " ");
            iter++;
        } while (iter < someArr.length);
        System.out.println();
    }

    @Override
    public void printEverySecondElement(int[] someArr) {
        int iter = 1;

        System.out.println("Ввывод каждого второго элемента массива:");

        do {
            if (iter % 2 == 0) {
                System.out.print(someArr[iter - 1] + " ");
            }
            iter++;
        } while (iter <= someArr.length);
        System.out.println();
    }

    @Override
    public void printElementsInReverseOrder(int[] someArr) {
        int iter = someArr.length - 1;

        System.out.println("Вывести все элементы массива в консоль в обратном порядке");

        do {
            System.out.print(someArr[iter] + " ");
            iter--;
        } while (iter >= 0);
        System.out.println();
    }
}
