package bronze4.day11;

import java.util.Scanner;

public class BOJ1264 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String text = sc.nextLine();
            if (text.equals("#")) break;
            char[] word = text.toCharArray();

            int count = 0;
            for (int i=0; i< word.length; i++) {
                if(word[i] == 'a' || word[i] == 'e' || word[i] == 'i' || word[i] == 'o' || word[i] == 'u' ||
                   word[i] == 'A' || word[i] == 'E' || word[i] == 'I' || word[i] == 'O' || word[i] == 'U') {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
