package silver1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1932 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][N];
        int[][] dp = new int[N][N];
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <= i; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp[0][0] = arr[0][0];
        for(int i = 1; i < N; i++) {
            for(int j = 0; j <= i; j++) {
                if(j==0) {
                    dp[i][j] = dp[i-1][j] + arr[i][j];
                } else if(j==i) {
                    dp[i][j] = dp[i-1][j-1] + arr[i][j];
                } else {
                    dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
                }
            }
        }
        int max = 0;
        for(int i = 0; i < N; i++) {
            if(max < dp[N-1][i])
                max = dp[N-1][i];
        }

		bw.write(String.valueOf(max));
		bw.flush();
	}
}
