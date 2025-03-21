package bronze4.day7;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2752 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[3];
        for(int i=0; i<num.length; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num); // 오름차순
        System.out.print(num[0] + " " + num[1] + " " + num[2]);
    }
}
