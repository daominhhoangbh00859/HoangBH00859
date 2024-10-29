
public class Main {
    public static void main(String[] args) {
        class Stack {
            private int maxSize;
            private int[] stackArray;
            private int top;


            public Stack(int size) {
                maxSize = size;
                stackArray = new int[maxSize];
                top = -1;
            }
            public void push(int value) {
                if (top == maxSize - 1) {
                    System.out.println("Stack is full. Cannot push " + value);
                    return;
                }
                stackArray[++top] = value;
            }
            public int pop() {
                if (isEmpty()) {
                    System.out.println("Stack is empty. Cannot pop.");
                    return -1; // Hoặc ném ngoại lệ
                }
                return stackArray[top--];
            }
            public int peek() {
                if (isEmpty()) {
                    System.out.println("Stack is empty. Cannot peek.");
                    return -1;
                }
                return stackArray[top];
            }
            public boolean isEmpty() {
                return (top == -1);
            }
        }
    }
}
