package home_work_2.arrays;

public class ForEachOperation implements IArraysOperation {
    @Override
    public void printArray(int[] someArr) {
        System.out.println("Ввывод элементов массива:");
        for (int someInt : someArr) {
            System.out.print(someInt + " ");
        }
        System.out.println();
    }

    @Override
    public void printEverySecondElement(int[] someArr) {
        System.out.println("Ввывод каждого второго элемента массива:");
        int iter = 1;
        for (int someInt : someArr) {
            if (iter % 2 == 0) {
                System.out.print(someInt + " ");
            }
            iter++;
        }
        System.out.println();
    }

    @Override
    public void printElementsInReverseOrder(int[] someArr) {
        System.out.println("Вывести все элементы массива в консоль в обратном порядке");
        int iter = someArr.length - 1;
        for (int someInt : someArr) {
            System.out.print(someArr[iter] + " ");
            iter--;
        }
        System.out.println();
    }
}
