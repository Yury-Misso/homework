package home_work_3.calcs.additional;

import home_work_3.calcs.api.ICalculator;

public class CalculatorStringExpression {

    ICalculator iCalculator;

    public CalculatorStringExpression(ICalculator iCalculator) {
        this.iCalculator = iCalculator;
    }

    public Token calculate(MySimpleList<Token> tokenList) {
        MySimpleList<Token> simpleListToken = new MySimpleList<>();
        boolean endList = false;
        int numberOfToken = 0;
        double result = 0;
        double resultMain = 0;
        double resultRecur = 0;
        int countBrackets = 0;
        while (numberOfToken < (tokenList.size())) {
            if (tokenList.get(numberOfToken).getType().equalsIgnoreCase("number")) {
                simpleListToken.add(tokenList.get(numberOfToken));

                numberOfToken++;

            } else if (tokenList.get(numberOfToken).getType().equalsIgnoreCase("function")) {
                if ((tokenList.get(numberOfToken).getValue().equalsIgnoreCase("+"))
                        || (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("-"))
                        || (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("*"))
                        || (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("/"))) {
                    simpleListToken.add(tokenList.get(numberOfToken));

                    numberOfToken++;

                }
                if (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("(")) {
                    MySimpleList<Token> innerListToken = new MySimpleList<>();
                    countBrackets++;
                    //innerListToken.add(tokenList.get(numberOfToken));
                    numberOfToken++;

                    while (countBrackets != 0) {

                        if (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("(")) {
                            countBrackets++;

                        }
                        if (tokenList.get(numberOfToken).getValue().equalsIgnoreCase(")")) {
                            countBrackets--;

                        }
                        innerListToken.add(tokenList.get(numberOfToken));
                        numberOfToken++;

                    }
                    innerListToken.remove(innerListToken.size() - 1);
                    System.out.println(innerListToken);

                    simpleListToken.add(new Token("number", calculate(innerListToken).getValue()));
                }

            }

        }

        return new Token("number", Double.toString(calculateSimple(simpleListToken)));
    }


    public double calculateSimple(MySimpleList<Token> tokenList) {
        int maxPriority = getPriority(tokenList);

        double firstNumber = 0;
        double secondNumber = 0;
        double result = 0;

        if (tokenList.size() == 2) {
            if ((tokenList.get(0).getValue().equalsIgnoreCase("-")) &&
                    (tokenList.get(1).getType().equalsIgnoreCase("number"))) {
                secondNumber = Double.parseDouble(tokenList.get(1).getValue());
                result = firstNumber - secondNumber;
            }
            return result;
        }


        if (tokenList.size > 2) {
            int numberOfToken = 0;
            while (tokenList.size() > 1) {

                while (maxPriority == 2) {

                    while (!((tokenList.get(numberOfToken).getType().equalsIgnoreCase("function"))
                            && ((tokenList.get(numberOfToken).getValue().equalsIgnoreCase("*"))
                            || (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("/"))))) {
                        numberOfToken++;
                    }

                    if (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("*")) {
                        firstNumber = Double.parseDouble(tokenList.get(numberOfToken - 1).getValue());

                        secondNumber = Double.parseDouble(tokenList.get(numberOfToken + 1).getValue());

                        result = iCalculator.multiply(firstNumber, secondNumber);

                    } else if (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("/")) {
                        firstNumber = Double.parseDouble(tokenList.get(numberOfToken - 1).getValue());
                        secondNumber = Double.parseDouble(tokenList.get(numberOfToken + 1).getValue());
                        result = iCalculator.divide(firstNumber, secondNumber);
                    }
                    tokenList.remove(numberOfToken);
                    tokenList.remove(numberOfToken);
                    tokenList.remove(numberOfToken - 1);
                    tokenList.add(numberOfToken - 1, new Token("number", Double.toString(result)));
                    numberOfToken = 0;

                    maxPriority = getPriority(tokenList);


                    if (tokenList.size() == 1) {
                        return result;
                    }
                }

                while (maxPriority == 1) {

                    while (!((tokenList.get(numberOfToken).getType().equalsIgnoreCase("function"))
                            && ((tokenList.get(numberOfToken).getValue().equalsIgnoreCase("+"))
                            || (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("-"))))) {
                        numberOfToken++;
                    }

                    if (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("+")) {
                        firstNumber = Double.parseDouble(tokenList.get(numberOfToken - 1).getValue());

                        secondNumber = Double.parseDouble(tokenList.get(numberOfToken + 1).getValue());

                        result = iCalculator.sum(firstNumber, secondNumber);

                    }
                    if (tokenList.get(numberOfToken).getValue().equalsIgnoreCase("-")) {
                        firstNumber = Double.parseDouble(tokenList.get(numberOfToken - 1).getValue());
                        secondNumber = Double.parseDouble(tokenList.get(numberOfToken + 1).getValue());
                        result = iCalculator.minus(firstNumber, secondNumber);
                    }
                    tokenList.remove(numberOfToken);
                    tokenList.remove(numberOfToken);
                    tokenList.remove(numberOfToken - 1);


                    tokenList.add(numberOfToken - 1, new Token("number", Double.toString(result)));


                    numberOfToken = 0;
                    maxPriority = getPriority(tokenList);
                    if (tokenList.size() == 1) {

                        return result;
                    }
                }

            }

        }
        return 0;
    }

    private int getPriority(MySimpleList<Token> tokenList) {
        int maxPriority = 0;
        if (tokenList.size > 2) {
            for (int i = 0; i < tokenList.size; i++) {
                if (tokenList.get(i).getType().equalsIgnoreCase("function")) {
                    if (((tokenList.get(i).getValue().equalsIgnoreCase("-")) ||
                            (tokenList.get(i).getValue().equalsIgnoreCase("+"))) &&
                            maxPriority < 2) {
                        maxPriority = 1;
                    }
                    if ((tokenList.get(i).getValue().equalsIgnoreCase("*")) ||
                            (tokenList.get(i).getValue().equalsIgnoreCase("/"))) {
                        maxPriority = 2;
                    }

                }
            }
        }
        return maxPriority;
    }

    public MySimpleList<Token> tokenize(String s) {
        MySimpleList<Token> tokenList = new MySimpleList<>();
        Token token;
        String regEx = "[\\d() .+*/^|PiE-]*";
        StringBuilder stringBuilder = new StringBuilder();
        boolean tokenizeDigit = false;
        if (s.matches(regEx)) {
            char[] chars = s.toCharArray();

            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '+') {
                    if (stringBuilder.toString().equalsIgnoreCase("E")) {
                        tokenList.add(new Token("number", Double.toString(2.718281828459045)));
                        stringBuilder.setLength(0);
                        //System.out.println("build E");
                    }
                    if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                        tokenList.add(new Token("number", Double.toString(3.1415926535897)));
                        stringBuilder.setLength(0);
                        //System.out.println("build Pi");
                    }
                    if (tokenizeDigit) {
                        tokenList.add(new Token("number", stringBuilder.toString()));
                        //System.out.println("build number");
                        stringBuilder.setLength(0);
                        tokenizeDigit = false;
                    }
                    tokenList.add(new Token("function", "+"));

                } else if (chars[i] == '-') {
                    if (stringBuilder.toString().equalsIgnoreCase("E")) {
                        tokenList.add(new Token("E", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build E");
                    }
                    if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                        tokenList.add(new Token("Pi", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build Pi");
                    }
                    if (tokenizeDigit) {
                        tokenList.add(new Token("number", stringBuilder.toString()));
                        //System.out.println("build number");
                        stringBuilder.setLength(0);
                        tokenizeDigit = false;
                    }
                    tokenList.add(new Token("function", "-"));

                } else if (chars[i] == '/') {
                    if (stringBuilder.toString().equalsIgnoreCase("E")) {
                        tokenList.add(new Token("E", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build E");
                    }
                    if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                        tokenList.add(new Token("Pi", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build Pi");
                    }
                    if (tokenizeDigit) {
                        tokenList.add(new Token("number", stringBuilder.toString()));
                        //System.out.println("build number");
                        stringBuilder.setLength(0);
                        tokenizeDigit = false;
                    }
                    tokenList.add(new Token("function", "/"));

                } else if (chars[i] == '*') {
                    if (stringBuilder.toString().equalsIgnoreCase("E")) {
                        tokenList.add(new Token("E", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build E");
                    }
                    if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                        tokenList.add(new Token("Pi", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build Pi");
                    }
                    if (tokenizeDigit) {
                        tokenList.add(new Token("number", stringBuilder.toString()));
                        //System.out.println("build number");
                        stringBuilder.setLength(0);
                        tokenizeDigit = false;
                    }
                    tokenList.add(new Token("function", "*"));
                } else if (chars[i] == '^') {
                    if (stringBuilder.toString().equalsIgnoreCase("E")) {
                        tokenList.add(new Token("E", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build E");
                    }
                    if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                        tokenList.add(new Token("Pi", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build Pi");
                    }
                    if (tokenizeDigit) {
                        tokenList.add(new Token("number", stringBuilder.toString()));
                        //System.out.println("build number");
                        stringBuilder.setLength(0);
                        tokenizeDigit = false;
                    }
                    tokenList.add(new Token("function", "^"));

                } else if (chars[i] == '|') {
                    if (stringBuilder.toString().equalsIgnoreCase("E")) {
                        tokenList.add(new Token("E", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build E");
                    }
                    if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                        tokenList.add(new Token("Pi", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build Pi");
                    }
                    if (tokenizeDigit) {
                        tokenList.add(new Token("number", stringBuilder.toString()));
                        //System.out.println("build number");
                        stringBuilder.setLength(0);
                        tokenizeDigit = false;
                    }
                    tokenList.add(new Token("function", "|"));

                } else if (chars[i] == '(') {
                    if (stringBuilder.toString().equalsIgnoreCase("E")) {
                        tokenList.add(new Token("E", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build E");
                    }
                    if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                        tokenList.add(new Token("Pi", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build Pi");
                    }
                    if (tokenizeDigit) {
                        tokenList.add(new Token("number", stringBuilder.toString()));
                        //System.out.println("build number");
                        stringBuilder.setLength(0);
                        tokenizeDigit = false;
                    }
                    tokenList.add(new Token("function", "("));

                } else if (chars[i] == ')') {
                    if (stringBuilder.toString().equalsIgnoreCase("E")) {
                        tokenList.add(new Token("E", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build E");
                    }
                    if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                        tokenList.add(new Token("Pi", stringBuilder.toString()));
                        stringBuilder.setLength(0);
                        //System.out.println("build Pi");
                    }
                    if (tokenizeDigit) {
                        tokenList.add(new Token("number", stringBuilder.toString()));
                        //System.out.println("build number");
                        stringBuilder.setLength(0);
                        tokenizeDigit = false;
                    }
                    tokenList.add(new Token("function", ")"));

                } else if ((chars[i] > 47 && chars[i] < 58) || chars[i] == '.') {
                    tokenizeDigit = true;
                    stringBuilder.append(chars[i]);
                } else if (chars[i] == 80 || chars[i] == 112 || chars[i] == 73 || chars[i] == 105) {
                    stringBuilder.append(chars[i]);
                } else if (chars[i] == 'E') {
                    stringBuilder.append(chars[i]);
                    //System.out.println(stringBuilder);
                }


            }

            if (stringBuilder.toString().equalsIgnoreCase("E")) {
                tokenList.add(new Token("E", stringBuilder.toString()));
                stringBuilder.setLength(0);
                //System.out.println("build E");
            }
            if (stringBuilder.toString().equalsIgnoreCase("Pi")) {
                tokenList.add(new Token("Pi", stringBuilder.toString()));
                stringBuilder.setLength(0);
                //System.out.println("build Pi");
            }
            if (tokenizeDigit) {
                tokenList.add(new Token("number", stringBuilder.toString()));
                //System.out.println("build number");
                stringBuilder.setLength(0);
            }

        }

        return tokenList;
    }

    private class Token {
        private String type;
        private String value;

        public Token(String type, String value) {
            this.type = type;
            this.value = value;
        }

        public String getType() {
            return type;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    private class MyStack<T> {
        private Node<T> head;
        private Node<T> tail;

        private int size = 0;

        /**
         * Add an element to the top of the stack
         *
         * @param value - an element
         */
        public void push(T value) {
            if (this.head == null) {
                this.head = new Node<>(value, null);
            } else if (this.head != null && this.tail == null) {
                this.tail = new Node<>(value, this.head);
            } else {
                Node<T> tempNode = this.tail;
                tail = new Node<>(value, tempNode);
            }
            size++;
        }

        /**
         * Remove an element from the top of the stack
         *
         * @return - an element
         */
        public T pop() {
            if (!empty()) {
                T value;
                if (this.size == 1) {
                    value = this.head.getValue();
                    this.size--;
                    return value;
                } else {
                    value = this.tail.getValue();
                    this.tail = this.tail.getPreviousNode();
                    this.size--;
                    return value;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        /**
         * Looks at the object at the top of this stack without removing it from the stack.
         *
         * @return - an element
         */
        public T peek() {
            if (!empty()) {
                return this.tail.getValue();
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        /**
         * Check whether a stack is empty or not
         *
         * @return - true or false
         */
        public boolean empty() {
            return !(this.size > 0);
        }


        private class Node<T> {
            private Node<T> previousNode;
            private T value;

            public Node(T value, Node<T> previousNode) {
                this.value = value;
                this.previousNode = previousNode;
            }

            public T getValue() {
                return this.value;
            }

            public Node<T> getPreviousNode() {
                return this.previousNode;
            }
        }

    }

    private class MySimpleList<T> {
        private Object[] values;
        private int size = 0;

        public MySimpleList() {
            this.values = new Object[10];
        }

        public void remove(int index) {
            if (index >= 0 && index < size) {
                Object[] newArr = new Object[size - 1];
                for (int j = 0; j < index; j++) {
                    newArr[j] = values[j];
                }
                for (int j = index; j < size - 1; j++) {
                    newArr[j] = values[j + 1];
                }
                size--;
                values = newArr;
            }
        }

        public void add(int i, T value) {
            if (size == 0) {
                add(value);
            } else if (i >= 0 && i < size) {
                Object[] newArr = new Object[size + 1];
                for (int j = 0; j < i; j++) {
                    newArr[j] = values[j];
                }
                newArr[i] = value;
                for (int j = i; j < size; j++) {
                    newArr[j + 1] = values[j];
                }
                size++;
                values = newArr;
            }
        }

        public void add(T value) {
            if (this.size > this.values.length - 1) {
                grow();
            }
            this.values[this.size] = value;
            this.size++;
        }

        public T get(int i) {
            if (i >= 0 && i < this.size) {
                return (T) this.values[i];
            } else {
                return null;
            }
        }

        public int size() {
            return this.size;
        }

        @Override
        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < this.size; i++) {
                stringBuilder.append(this.values[i]);
                if (i < this.size - 1) {
                    stringBuilder.append(" ");
                }
            }
            return stringBuilder.toString();
        }

        private void grow() {
            Object[] newArr = new Object[this.values.length + 10];
            for (int i = 0; i < this.values.length; i++) {
                newArr[i] = this.values[i];
            }
            this.values = newArr;
        }
    }
}
