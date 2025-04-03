package algorithm_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ12891 {
    static int[] requiredArr;
    static int[] myArr;
    static int checkedArr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        char[] DNA = new char[S];
        requiredArr = new int[4];
        myArr = new int[4];
        int result = 0;
        checkedArr = 0;

        DNA = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<4; i++) {
            requiredArr[i] = Integer.parseInt(st.nextToken());
            if (requiredArr[i] == 0) {
                checkedArr++;
            }
        }

        for (int i=0; i<P; i++) {
            Add(DNA[i]);
        }

        if (checkedArr == 4) result++;

        for (int i=P; i<S; i++) {
            int j = i - P;
            Add(DNA[i]);
            Remove(DNA[j]);
            if (checkedArr == 4) result++;
        }

        System.out.println(result);

    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == requiredArr[0]) checkedArr++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == requiredArr[1]) checkedArr++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == requiredArr[2]) checkedArr++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == requiredArr[3]) checkedArr++;
                break;
        }
    }

    private static void Remove(char c) {
        switch (c) {
            case 'A':
                if (myArr[0] == requiredArr[0]) checkedArr--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == requiredArr[1]) checkedArr--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == requiredArr[2]) checkedArr--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == requiredArr[3]) checkedArr--;
                myArr[3]--;
                break;
        }
    }
}
