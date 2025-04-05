package excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940_1 {
    // 투 포인터
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numsArr = new int[N];

        for (int i=0; i<N; i++) {
            numsArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(numsArr);

        int count = 0;
        int i = 0;
        int j = N-1;
        while (i < j) {
            if (numsArr[i] + numsArr[j] == M) {
                count++; i++; j--;
            } else if (numsArr[i] + numsArr[j] > M) {
                j--;
            } else {
                i++;
            }
        }
        System.out.println(count);
    }
}
