import java.util.Scanner;

// Selection Sort
class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        int cnt = 0;
        int swapIndex = 0;
        for (int i = 0; i < A.length; i++) {
            int minJ = A[i];
            for (int j = i; j < A.length; j++) {
                if (minJ > A[j]) {
                    minJ = A[j];
                    swapIndex = j;
                }
            }

            if (minJ < A[i]) {
                int tmp = A[i];
                A[i] = minJ;
                A[swapIndex] = tmp;
                cnt++;
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