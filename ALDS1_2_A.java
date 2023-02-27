import java.util.Scanner;

// Bubble Sort
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int cnt = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = A.length - 1; j > i; j--) {
                int former = A[j - 1];
                int later = A[j];
                if (later < former) {
                    A[j - 1] = later;
                    A[j] = former;
                    cnt++;
                }
            }
        }
        out(A);
        System.out.println(cnt);
    }

    private static void out(int[] A) {
        System.out.printf("%d", A[0]);
        for (int k = 1; k < A.length; k++) {
            System.out.printf(" %d", A[k]);
        }
        System.out.printf("\n");
    }

}