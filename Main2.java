public class Main2 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedListStack {
        private Node top;

        // Khởi tạo ngăn xếp
        public LinkedListStack() {
            top = null;
        }

        // Thêm phần tử vào ngăn xếp
        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
        }

        // Xóa và trả về phần tử ở đỉnh ngăn xếp
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        // Trả về giá trị ở đỉnh ngăn xếp
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek.");
                return -1;
            }
            return top.data;
        }

        // Kiểm tra ngăn xếp có rỗng không
        public boolean isEmpty() {
            return (top == null);
        }
    }
}
