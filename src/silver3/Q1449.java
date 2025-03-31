package silver3;

import java.io.*;
import java.util.*;

public class Q1449 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] holes = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            holes[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(holes);

        int temp = 0;
        int result = 0;
        for (int i = 0; i < N; i++){
            if(holes[i] > temp){
                result++;
                temp = holes[i];
                temp += L - 1;
            }
        }

        System.out.println(result);
    }
}