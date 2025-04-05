package excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891_1 {
    // 슬라이드 윈도우
    static int[] ACGT;
    static int[] myACGT;
    static int checkedACGT;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] DNA = new char[S];
        ACGT = new int[4];
        myACGT = new int[4];
        int count = 0;
        checkedACGT = 0;

        DNA = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            ACGT[i] = Integer.parseInt(st.nextToken());
            if (ACGT[i] == 0) {
                checkedACGT++;
            }
        }

        for (int i=0; i<P; i++) {
            Add(DNA[i]);
        }

        if (checkedACGT == 4) {
            count++;
        }

        // 슬라이드 윈도우 작동 반복문
        for (int i=P; i<S; i++) {
            int j = i - P;
            Add(DNA[i]);
            Remove(DNA[j]);
            if (checkedACGT == 4) {
                count++;
            }
        }

        System.out.println(count);

    }

    public static void Add(char c) {
        switch (c) {
            case 'A' :
                myACGT[0]++;
                if (myACGT[0] == ACGT[0]) checkedACGT++;
                break;
            case 'C' :
                myACGT[1]++;
                if (myACGT[1] == ACGT[1]) checkedACGT++;
                break;
            case 'G' :
                myACGT[2]++;
                if (myACGT[2] == ACGT[2]) checkedACGT++;
                break;
            case 'T' :
                myACGT[3]++;
                if (myACGT[3] == ACGT[3]) checkedACGT++;
                break;
        }
    }

    public static void Remove(char c) {
        switch (c) {
            case 'A' :
                if (myACGT[0] == ACGT[0]) checkedACGT--;
                myACGT[0]--;
                break;
            case 'C' :
                if (myACGT[1] == ACGT[1]) checkedACGT--;
                myACGT[1]--;
                break;
            case 'G' :
                if (myACGT[2] == ACGT[2]) checkedACGT--;
                myACGT[2]--;
                break;
            case 'T' :
                if (myACGT[3] == ACGT[3]) checkedACGT--;
                myACGT[3]--;
                break;
        }
    }
}
