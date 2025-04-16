package excercise;

import java.util.Scanner;
import java.util.Stack;

public class BOJ1874_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] NArr = new int[N];
        for (int i=0; i<N; i++) {
            NArr[i] = sc.nextInt();
        }

        int num = 1;
        boolean result = true;
        Stack<Integer> stack = new Stack<>();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i=0; i<NArr.length; i++) {
            if (NArr[i] >= num) {
                while (NArr[i] >= num) {
                    stack.push(num++);
                    stringBuffer.append("+\n");
                }
                stack.pop();
                stringBuffer.append("-\n");
            } else {
                int poppedArr = stack.pop();
                if (NArr[i] < poppedArr) {
                    System.out.println("NO");
                    result = false;
                    break;
                } else {
                    stringBuffer.append("-\n");
                }
            }
        }
        if (result) System.out.println(stringBuffer);
    }
}
