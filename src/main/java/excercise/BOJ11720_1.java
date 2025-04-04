package excercise;

import java.util.Scanner;

public class BOJ11720_1 {
    // 배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
//        5(  ) <- nextLine() 이용 시 빈칸 입력 받음
//        54321
//        String num = sc.nextLine();
        char[] numArray = num.toCharArray();

        int sum = 0;
        for (int i=0; i<N; i++) {
            sum += numArray[i] - '0';
        }

        System.out.println(sum);
    }
}
