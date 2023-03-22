import java.util.Scanner;

// Queue structure
class Main {
    public static void main(String[] args) {

        int MAX = 100000;

        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(MAX);

        String[] firstInput = sc.nextLine().split(" ");
        int NUM = Integer.parseInt(firstInput[0]);
        int QUANTUM = Integer.parseInt(firstInput[1]);

        int total = 0;
        for (int i = 0; i < NUM; i++) {
            String[] input = sc.nextLine().split(" ");
            int time = Integer.parseInt(input[1]);
            total += time;

            Process p = new Process(input[0], time);
            queue.enqueue(p);
        }

        int progress = 0;
        while (progress < total) {
            Process p = queue.dequeue();
            if (p.getTime() - QUANTUM > 0) {
                p.setTime(p.getTime() - QUANTUM);
                queue.enqueue(p);
                progress += QUANTUM;
            } else {
                progress += p.getTime();
                System.out.println(p.getName() + " " + progress);
            }
        }
    }
}

class Process {
    private String name;
    private int time;

    Process(String arg_name, int arg_time) {
        name = arg_name;
        time = arg_time;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }
}

class Queue {

    private Process[] arr;
    private int head = 0;
    private int tail = 0;
    private int _size;

    Queue(int size) {
        _size = size;
        arr = new Process[_size];
    }

    public void enqueue(Process p) {
        if (this.isFull()) {
            System.err.println("queue is full");
        }

        arr[tail] = p;
        if (tail + 1 == _size) {
            tail = 0;
        } else {
            tail++;
        }
    }

    public Process dequeue() {
        if (this.isEmpty()) {
            System.err.println("queue is empty");
        }

        Process tmp = arr[head];
        if (head + 1 == _size) {
            head = 0;
        } else {
            head++;
        }
        return tmp;
    }

    private boolean isEmpty() {
        return head == tail;
    }

    private boolean isFull() {
        return (tail + 1) % _size == head;
    }
}