import java.util.Scanner;

// Stack structure
class Main {
    public static void main(String[] args) {

        int MAX = 256;

        Scanner sc = new Scanner(System.in);
        Stack stack = new Stack(MAX);

        String[] tokens = sc.nextLine().split(" ");

        for (int i = 0; i < tokens.length; i++) {
            String tmp = tokens[i];

            if (tmp.equals("+")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(a + b);
            } else if (tmp.equals("*")) {
                int result = stack.pop() * stack.pop();
                stack.push(result);
            } else if (tmp.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else {
                stack.push(Integer.parseInt(tmp));
            }
        }
        System.out.println(stack.pop());
    }
}

class Stack {

    private int[] arr;
    private int pointer = 0;
    private int max;

    Stack(int size) {
        max = size;
        arr = new int[max];
    }

    public void push(int x) {
        if (this.isFull()) {
            System.err.println("stack is full");
        }
        pointer++;
        arr[pointer] = x;
    }

    public int pop() {
        if (this.isEmpty()) {
            System.err.println("stack is empty");
        }
        // pointer--;
        return arr[pointer--];
    }

    private boolean isEmpty() {
        return pointer == 0;
    }

    private boolean isFull() {
        return arr.length > max;
    }
}