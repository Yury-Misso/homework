package home_work_1;

public class Task2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = 8;

        System.out.println("a= " + a + " b= " + b + " c= " + c);
        System.out.println("2.1 : a + b / c = " + (a + b / c) + " <-> (int) 2/8=0 -> 5+0=5");
        System.out.println("2.2 : (a + b) / c = " + ((a + b) / c) + " <-> 5+2=7 -> (int) 7/8=0");
        System.out.println("2.3 : (a + b++) / c = " + ((a + b++) / c) + " <-> 5+2=7 -> (int) 7/8=0 b=3");
        System.out.println("2.4 : (a + b++) / --c = " + ((a + b++) / --c) + " <-> 5+3=8 -> (int) 8/7=1 b=4 c=7");
        b = 2;
        c = 8;
        System.out.println("a= " + a + " b= " + b + " c= " + c);
        System.out.println(b >> 2);
        System.out.println("2.5 : (a * b>>b++) / --c = " + ((a * b >> b++) / --c) + " <-> 2>>2=0 (2=0010) -> 5*0=0 -> 0/7=0 b=3 c=7");
        b = 2;
        c = 8;
        System.out.println("2.6 : (a + 7>20?68:22*b>>b++) / --c = " + ((a + 7 > 20 ? 68 : 22 * b >> b++) / --c) + " " +
                "<-> 5+7=12 -> 12>20=false=22*2=44 -> 44>>2=11 (44=0010 1100>>2=0000 1011=11) -> (int) 11/8=1 b=3 c=7");
        b = 2;
        c = 8;
        System.out.println("2.7 : (a + 7 > 20 ? 68 >= 68 : 22 * b >> b++) / --c = " +
                //((a + 7 > 20 ? 68 >= 68 : 22 * b >> b++) / --c) + "Err " +
                "<-> booleanExpression ? expression1 : expression2 " +
                "The very first operand must be a boolean expression, and the second and third operands can be any expression that returns some value");

        b = 2;
        c = 8;
        System.out.println("2.8 : (6 - b > 3 && 12 * 12 <=119 " +
                ((6 - b > 3 && 12 * 12 <= 119) +
                        " <-> 6-2=4 -> 4>3=true -> 12*12=144 -> 144<=119=false -> true&&false=false"));

        System.out.println("2.9 : true && false " +
                (true && false) + " <-> true&&false=false");

    }
}
