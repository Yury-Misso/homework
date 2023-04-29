package home_work_2.arrays;

public class WhileOperation implements IArraysOperation {
    @Override
    public void printArray(int[] someArr) {
        System.out.println("������ ��������� �������:");
        int iter = 0;
        while (iter < someArr.length) {
            System.out.print(someArr[iter] + " ");
            iter++;
        }
        System.out.println();
    }

    @Override
    public void printEverySecondElement(int[] someArr) {
        System.out.println("������ ������� ������� �������� �������:");
        int iter = 1;
        while (iter <= someArr.length) {
            if (iter % 2 == 0) {
                System.out.print(someArr[iter - 1] + " ");
            }
            iter++;
        }
        System.out.println();
    }

    @Override
    public void printElementsInReverseOrder(int[] someArr) {
        System.out.println("������� ��� �������� ������� � ������� � �������� �������");
        int iter = someArr.length - 1;
        while (iter >= 0) {
            System.out.print(someArr[iter] + " ");
            iter--;
        }
        System.out.println();
    }
}
