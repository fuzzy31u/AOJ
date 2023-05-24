import java.util.Arrays;
import java.util.Scanner;

// Binary Search
class Main14B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int S[] = new int[n];
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            S[i] = tmp;
        }

        int q = sc.nextInt();
        int T[] = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = sc.nextInt();
        }

        int count = 0;

        for (int j = 0; j < T.length; j++) {
            int left = 0;
            int right = S.length - 1;

            int target = T[j];

            while (left < right) {
                int mid = (right + left) / 2;
                if (target == S[mid]) {
                    count++;
                    break;
                } else if (target < S[mid]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
        }

        System.out.println(count);
    }
}