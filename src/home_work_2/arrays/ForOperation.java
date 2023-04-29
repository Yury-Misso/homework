package home_work_2.arrays;

public class ForOperation implements IArraysOperation {
    @Override
    public void printArray(int[] someArr) {
        System.out.println("������ ��������� �������:");
        for (int i = 0; i < someArr.length; i++) {
            System.out.print(someArr[i] + " ");
        }
        System.out.println();
    }

    @Override
    public void printEverySecondElement(int[] someArr) {
        System.out.println("������ ������� ������� �������� �������:");
        for (int i = 1; i <= someArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(someArr[i - 1] + " ");
            }
        }
        System.out.println();
    }

    @Override
    public void printElementsInReverseOrder(int[] someArr) {
        System.out.println("������� ��� �������� ������� � ������� � �������� �������");
        for (int i = someArr.length - 1; i >= 0; i--) {
            System.out.print(someArr[i] + " ");
        }
        System.out.println();
    }
}
