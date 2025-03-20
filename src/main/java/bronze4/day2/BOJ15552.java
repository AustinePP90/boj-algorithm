package bronze4.day2;

import java.io.*;
import java.util.StringTokenizer;

public class BOJ15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // readLine()은 문자열을 반환
        for(int i=0; i<T; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()); // 한줄의 데이터를 저장하는 readLine을 쪼개서 사용할 때 사용
            int a = Integer.parseInt(st.nextToken()); // nextToken()은 문자열을 반환
            int b = Integer.parseInt(st.nextToken());
            bw.write(a+b + "\n"); // 바로 출력하는 것이 아닌 출력할 데이터를 모아둠
        }
        bw.flush(); // write로 모아둔 데이터를 한번에 출력 함
        bw.close();
    }
}
