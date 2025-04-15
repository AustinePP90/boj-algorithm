package excercise;

import java.util.Scanner;

public class BOJ2018_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i_index = 1;
        int j_index = 1;
        int sum = 1;
        int result = 1;

        while (j_index != N) {
            if (sum > N) {
                sum -= i_index;
                i_index++;
            } else if (sum < N) {
                j_index++;
                sum += j_index;
            } else {
                result++;
                j_index++;
                sum += j_index;
            }
        }
        System.out.println(result);
    }
}
