package excercise;

import java.util.Scanner;

public class BOJ2750_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] NArr = new int[N];
        for (int i=0; i<N; i++) {
            NArr[i] = sc.nextInt();
        }

        for (int i=0; i<N-1; i++) {
            for (int j=0; j<N-1-i; j++) {
                if (NArr[j] > NArr[j+1]) {
                    int temp = NArr[j];
                    NArr[j] = NArr[j+1];
                    NArr[j+1] = temp;
                }
            }
        }

        for (int i=0; i<N; i++) {
            System.out.println(NArr[i]);
        }
    }
}
