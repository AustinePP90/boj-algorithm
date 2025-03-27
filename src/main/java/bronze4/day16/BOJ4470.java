package bronze4.day16;

import java.util.Scanner;

public class BOJ4470 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());
//        sc.nextLine();
        for (int i=1; i<=N; i++) {
            String text = sc.nextLine();
            System.out.println(i + ". " + text);
        }
    }
}
