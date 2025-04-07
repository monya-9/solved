package bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Q17173 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] K = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            K[i] = Integer.parseInt(st.nextToken());
        }

        boolean[]  visited = new boolean[N+1];
        int sum = 0;
        for(int num: K){
            for(int i = num; i <= N; i += num){
                if(!visited[i]){
                    visited[i] = true;
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
}