package bronze4.day6;

import java.util.Scanner;

public class BOJ10808 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alphabet = new int[26];
        char[] word = sc.next().toCharArray();
        for(int i=0; i< word.length; i++){
            alphabet[word[i]-97]++;
        }

        for(int i=0; i<alphabet.length; i++){
            System.out.print(alphabet[i] + " ");
        }
    }
}
