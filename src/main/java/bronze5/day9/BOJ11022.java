package bronze5.day9;


import java.util.Scanner;

public class BOJ11022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = A + B;
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + C );
        }
    }
}
