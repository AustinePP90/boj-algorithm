package bronze4.day15;

import java.util.Scanner;

public class BOJ24723 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] key = {1,2,4,8,16,32};
        System.out.println(key[N]);
    }
}
