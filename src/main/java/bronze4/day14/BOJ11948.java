package bronze4.day14;

import java.util.Scanner;

public class BOJ11948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int min_a = Integer.MAX_VALUE;
        int min_b = Integer.MAX_VALUE;
        for (int i=0; i<4; i++) {
            int score = sc.nextInt();
            sum += score;
            if (score < min_a) min_a = score;
        }
        for (int i=0; i<2; i++) {
            int score = sc.nextInt();
            sum += score;
            if (score < min_b) min_b = score;
        }

        System.out.println(sum - min_a - min_b);
    }
}
