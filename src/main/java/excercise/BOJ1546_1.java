package excercise;

import java.util.Scanner;

public class BOJ1546_1 {
    // 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] scoreArr = new int[N];
        int highScore = 0;

        for (int i=0; i<N; i++) {
            scoreArr[i] = sc.nextInt();
            if (scoreArr[i] > highScore) highScore = scoreArr[i];
        }

        double sum = 0;
        for (int i=0; i<N; i++) {
            sum += (double) scoreArr[i] / highScore * 100;
        }

        System.out.println(sum / N);
    }
}
