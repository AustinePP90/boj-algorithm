package bronze4.day11;

import java.util.Scanner;

public class BOJ10987 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        char[] single_w = word.toCharArray();
        int count = 0;
        for(int i=0; i<single_w.length; i++) {
            if (single_w[i] == 'a' || single_w[i] == 'e' || single_w[i] == 'i' || single_w[i] == 'o' || single_w[i] == 'u') {
                count++;
            }
        }
        System.out.println(count);
    }
}
