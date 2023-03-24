import java.util.Arrays;
import java.util.Scanner;

// Linear Search
class Main14A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int S[] = new int[0];
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            S = appendUnique(S, tmp);
        }

        int q = sc.nextInt();
        int T[] = new int[q];
        for (int i = 0; i < q; i++) {
            T[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < S.length; i++) {
            for (int j = 0; j < T.length; j++) {
                if (S[i] == T[j]) {
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);
    }

    private static int[] appendUnique(int[] arr, int value) {
        boolean isDup = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                isDup = true;
                break;
            }
        }
        if (!isDup) {
            int[] newArr = Arrays.copyOf(arr, arr.length + 1);
            newArr[newArr.length - 1] = value;
            return newArr;
        }
        return arr;
    }
}