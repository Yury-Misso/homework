package home_work_6.classes;

import java.util.ArrayList;

import java.util.List;

public class Printer {
    List<Line> lines = new ArrayList<>();

    public void addLine(String s1, int length, String s2, String colorText, String colorLine) {
        lines.add(new Line(s1, length, s2, colorText, colorLine));
    }

    public void printTable() {
        int maxS1 = 0;
        int maxLength = 0;
        int maxS2 = 0;
        int lengthLine = 75;

        for (Line line : lines) {
            if (line.getS1().length() > maxS1) {
                maxS1 = line.getS1().length();
            }
            if (line.getLength() > maxLength) {
                maxLength = line.getLength();
            }
            if (line.getS2().length() > maxS2) {
                maxS2 = line.getS2().length();
            }
        }


        for (Line line : lines) {
            System.out.print(line.getColorText());
            System.out.print(line.getS1());
            System.out.print(ConsoleColors.RESET);
            int countSpace = maxS1 - line.getS1().length();
            for (int i = 0; i < countSpace + 1; i++) {
                System.out.print(" ");
            }

            System.out.print(line.getColorLine());
            countSpace = (int) Math.ceil((((double) (line.getLength() * lengthLine)) / maxLength));
            for (int i = 0; i < countSpace; i++) {
                System.out.print(" ");
            }
            System.out.print(ConsoleColors.RESET);

            for (int i = 0; i < lengthLine - countSpace; i++) {
                System.out.print(" ");
            }
            System.out.print(" ");
            System.out.print(line.getColorText());
            System.out.print(line.getS2());
            System.out.print(ConsoleColors.RESET);
            System.out.println();
        }
        lines.clear();
    }

    private class Line {
        private String s1;
        private int length;
        private String s2;
        private String colorText;
        private String colorLine;

        public Line(String s1, int length, String s2, String colorText, String colorLine) {
            this.s1 = s1;
            this.length = length;
            this.s2 = s2;
            this.colorText = colorText;
            this.colorLine = colorLine;
        }

        public String getS1() {
            return s1;
        }

        public int getLength() {
            return length;
        }

        public String getS2() {
            return s2;
        }

        public String getColorText() {
            return colorText;
        }

        public String getColorLine() {
            return colorLine;
        }
    }
}
