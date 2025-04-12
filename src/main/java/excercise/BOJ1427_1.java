package excercise;

import java.util.Scanner;

public class BOJ1427_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        int[] NArr = new int[N.length()];
        for (int i=0; i<NArr.length; i++) {
            NArr[i] = Integer.parseInt(N.substring(i, i+1));
        }

        for (int i=0; i<NArr.length; i++) {
            int Max = i;
            for (int j=i; j<NArr.length; j++) {
                if (NArr[j] > NArr[Max]) {
                    Max = j;
                }
            }
            if (NArr[i] < NArr[Max]) {
                int temp = NArr[i];
                NArr[i] = NArr[Max];
                NArr[Max] = temp;
            }
        }

        for (int i=0; i<NArr.length; i++) {
            System.out.print(NArr[i]);
        }
    }
}
