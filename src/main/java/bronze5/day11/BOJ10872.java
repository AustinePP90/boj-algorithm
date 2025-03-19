package bronze5.day11;

import java.util.Scanner;

public class BOJ10872 {
    public static void main(String[] args) {
        // 팩토리얼, N! -> 1~N 까지의 곱 ex) 5! = 1*2*3*4*5, 0!은 무조건 1
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if(N < 2) {
            System.out.println(1);
        } else {
            int fac = 1;
            for(int i = 2; i <= N; i++) {
                fac *= i;
            }
            System.out.println(fac);
        }
    }
}
