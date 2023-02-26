import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // ArrayList<Integer> A = new ArrayList<Integer>();
        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        out(A);

        for (int i = 1; i < A.length; i++) {
            int j = i - 1;
            int v = A[i];
            while (j != -1 && v < A[j]) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = v;

            out(A);
        }
    }

    private static void out(int[] A) {
        System.out.printf("%d", A[0]);
        for (int k = 1; k < A.length; k++) {
            System.out.printf(" %d", A[k]);
        }
        System.out.printf("\n");
    }
}