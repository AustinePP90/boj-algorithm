package bronze4.day19;

import java.util.Scanner;

public class BOJ4299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int plus = sc.nextInt();
        int minus = sc.nextInt();
        int winner = (plus+minus)/2;
        int loser = (plus-minus)/2;
        if (plus < minus) {
            System.out.println(-1);
        } else {
            if (plus == winner + loser && minus == winner - loser) {
                System.out.println(winner + " " + loser);
            } else {
                System.out.println(-1);
            }
        }
    }
}
