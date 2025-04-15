package excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ1940_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] NArr = new int[N];
        int result = 0;
        int s_index = 0;
        int e_index = N-1;

        for (int i=0; i<N; i++) {
            NArr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(NArr);

        while (s_index < e_index) {
            if (NArr[s_index] + NArr[e_index] == M) {
                result++;
                s_index++;
                e_index--;
            } else if (NArr[s_index] + NArr[e_index] < M) {
                s_index++;
            } else {
                e_index--;
            }
        }
        System.out.println(result);
    }
}
