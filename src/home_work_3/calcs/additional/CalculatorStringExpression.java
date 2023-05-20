package home_work_3.calcs.additional;

public class CalculatorStringExpression {


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
                    tokenList.add(new Token("function", "+"));
                } else if (chars[i] == '-') {
                    tokenList.add(new Token("function", "-"));
                } else if (chars[i] == '/') {
                    tokenList.add(new Token("function", "/"));
                } else if (chars[i] == '*') {
                    tokenList.add(new Token("function", "*"));
                } else if (chars[i] >= 48 && chars[i] <= 57 && chars[i] == '.') {
                    tokenizeDigit = true;
                }

                if (tokenizeDigit) {
                    stringBuilder.append(chars[i]);
                }
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
