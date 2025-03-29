package bronze4.day20;

import java.util.Scanner;

public class BOJ14489 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Long A = sc.nextLong();
        Long B = sc.nextLong();
        Long C = sc.nextLong();
        if (A + B >= C*2) {
            System.out.println(A+B - C*2);
        } else {
            System.out.println(A+B);
        }
    }
}
