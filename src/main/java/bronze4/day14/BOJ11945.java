package bronze4.day14;

import java.util.Scanner;

public class BOJ11945 {
    // ????????????????????????????????????????????????????????
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        if (M > 0) {
            for (int i=0; i<N; i++) {
                char[] bread = sc.next().toCharArray();
                for(int j=M-1; j>=0; j--) {
                 System.out.print(bread[j]);
                }
                System.out.println();
            }
        }
    }
}
