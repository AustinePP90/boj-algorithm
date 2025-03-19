package day20;

import java.util.Scanner;

public class BOJ2744 {
    public static void main(String[] args) {
//         아스키 코드를 이용, 'A'(65) -> 'a'(97)
//        System.out.println((int)'A');
//        System.out.println((int)'B');
//        System.out.println((int)'a');
//        System.out.println((int)'b');
//        System.out.println((char)65);
//        System.out.println((char)66);
//        System.out.println((char)97);
//        System.out.println((char)98);
//        System.out.println('A' + 32);
//        System.out.println((char)('A' + 32));
        Scanner sc = new Scanner(System.in);
        char[] text = sc.nextLine().toCharArray();
        for(int i=0; i< text.length; i++) {
            char word = text[i];
            if(word>='a' && word<='z') {
                System.out.print((char)(word-32));
            } else {
                System.out.print((char)(word+32));
            }
        }
    }
}
