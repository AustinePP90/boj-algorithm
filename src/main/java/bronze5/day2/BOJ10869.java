package bronze5.day2;

import java.util.Scanner;

public class BOJ10869 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B); // 몫 출력
        System.out.println(A%B); // 나머지 출력
    }
}
