package silver5;

import java.io.*;
import java.util.*;

public class Q1010 {
	
	static int combination(int n, int r) {
        if (r == 0 || n == r) return 1;

        int result = 1;
        for (int i = 1; i <= r; i++) {
            result *= n--;
            result /= i;
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(combination(M, N)).append("\n");
        }

        System.out.print(sb);
    }
}
