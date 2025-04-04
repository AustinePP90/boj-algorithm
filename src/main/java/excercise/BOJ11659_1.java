package excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ11659_1 {
    // 구간 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] numArr = new int[N+1];
        int[] sumArr = new int[N+1];

        st = new StringTokenizer(br.readLine());
        for (int i=1; i<=N; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        // 합 배열 만들기 (S[i] = S[i -1] + A[i] - 구간 합 구할 때 필요)
        for (int i=1; i<=N; i++) {
            sumArr[i] = sumArr[i - 1] + numArr[i];
        }

        // 구간 합 구하기 (S[j] - S[i -1] - i에서 j까지 구간 합을 구하는 공식)
        for (int k=0; k<M; k++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            System.out.println(sumArr[j] - sumArr[i - 1]);
        }
    }
}
