import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        int maxV = -1;
        int minV = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxV < arr[i] - minV) {
                maxV = arr[i] - minV;
            }
            if (minV > arr[i]) {
                minV = arr[i];
            }
        }

        if (maxV == 0) {
            System.out.println(-1);
        } else {
            System.out.println(maxV);
        }

    }
}