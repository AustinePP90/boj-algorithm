package bronze4.day11;

import java.util.Scanner;

public class BOJ11365 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String sentence = sc.nextLine();
            if (sentence.equals("END")) break;
            char[] word = sentence.toCharArray();
            for( int i=word.length-1; i>=0; i--) {
                System.out.print(word[i]);
            }
            System.out.println();
        }
    }
}
