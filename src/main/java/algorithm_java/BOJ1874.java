package algorithm_java;

import java.util.Scanner;
import java.util.Stack;

public class BOJ1874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArr = new int[n];
        for (int i=0; i<n; i++) {
            nArr[i] = sc.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        int num = 1;
        boolean result = true;
        StringBuffer sb = new StringBuffer();
        for (int i=0; i<nArr.length; i++) {
            int singleArr = nArr[i];
            if (singleArr >= num) {
                while (singleArr >= num) {
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            } else {
                int poppedArr = stack.pop();
                if (poppedArr > singleArr) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    sb.append("-\n");
                }
            }
        }
        if (result) System.out.println(sb);
    }
}
