package bronze5.day3;

import java.util.Scanner;

public class BOJ2739 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
