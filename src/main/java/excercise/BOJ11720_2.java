package excercise;

import java.util.Scanner;

public class BOJ11720_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String num = sc.next();
//        char[] numArr = num.toCharArray();
//
//        int sum = 0;
//        for (int i=0; i<N; i++) {
//            sum += numArr[i] - 48;
//        }
//
//        System.out.println(sum);
        int[] numArr = new int[num.length()];
        for (int i=0; i<numArr.length; i++) {
            numArr[i] = Integer.parseInt(num.substring(i, i+1));
        }

        int sum = 0;
        for (int i=0; i<numArr.length; i++) {
            sum += numArr[i];
        }
        System.out.println(sum);
    }
}
