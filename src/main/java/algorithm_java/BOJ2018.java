package algorithm_java;

import java.util.Scanner;

public class BOJ2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int s_index = 1;
        int e_index = 1;
        int sum = 1;
        int count = 1;
        while (e_index != N) {
            if (sum == N) {
                e_index++; sum = sum + e_index; count++;
            } else if (sum < N) {
                e_index++; sum = sum +e_index;
            } else {
                sum = sum - s_index; s_index++;
            }
        }
        System.out.println(count);
    }
}
