package excercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891_2 {
    static int[] ACGT;
    static int[] myACGT;
    static int forResult;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] SArr = new char[S];
        ACGT = new int[4];
        myACGT = new int[4];
        int result = 0;
        forResult = 0;

        SArr = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
           ACGT[i] = Integer.parseInt(st.nextToken());
           if (ACGT[i] == 0) forResult++;
        }

        for (int i=0; i<P; i++) {
            Add(SArr[i]);
        }

        if (forResult == 4) result++;

        for (int i=P; i<S; i++) {
            int j = i - P;
            Add(SArr[i]);
            Remove(SArr[j]);
            if (forResult == 4) result++;
        }

        System.out.println(result);
    }

    public static void Add(char c) {
        switch (c) {
            case 'A' :
                myACGT[0]++;
                if (myACGT[0] == ACGT[0]) forResult++;
                break;
            case 'C' :
                myACGT[1]++;
                if (myACGT[1] == ACGT[1]) forResult++;
                break;
            case 'G' :
                myACGT[2]++;
                if (myACGT[2] == ACGT[2]) forResult++;
                break;
            case 'T' :
                myACGT[3]++;
                if (myACGT[3] == ACGT[3]) forResult++;
                break;
        }
    }

    public static void Remove(char c) {
        switch (c) {
            case 'A' :
                if (myACGT[0] == ACGT[0]) forResult--;
                myACGT[0]--;
                break;
            case 'C' :
                if (myACGT[1] == ACGT[1]) forResult--;
                myACGT[1]--;
                break;
            case 'G' :
                if (myACGT[2] == ACGT[2]) forResult--;
                myACGT[2]--;
                break;
            case 'T' :
                if (myACGT[3] == ACGT[3]) forResult--;
                myACGT[3]--;
                break;
        }
    }
}
