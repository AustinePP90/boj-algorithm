package bronze5.day18;

import java.util.Scanner;

public class BOJ2738 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] A = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                A[i][j] += sc.nextInt();
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
    }
}
