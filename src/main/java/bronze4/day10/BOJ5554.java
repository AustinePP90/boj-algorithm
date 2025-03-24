package bronze4.day10;

import java.util.Scanner;

public class BOJ5554 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//        int D = sc.nextInt();
//
//        int minutes = 0;
//        int seconds = A+B+C+D;
//        if (seconds > 59) {
//            minutes += seconds / 60;
//            seconds = seconds % 60;
//        }
//
//        System.out.println(minutes);
//        System.out.println(seconds);

        int s = 0;
        for (int i=0; i<4; i++){
            s += sc.nextInt();
        }
        System.out.println(s / 60);
        System.out.println(s % 60);
    }
}
