package silver4;

import java.io.*;
import java.util.*;

public class Q18110 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N == 0) {
            System.out.println(0);
            return;
        }

        int[] difficulties = new int[N];
        for (int i = 0; i < N; i++) {
            difficulties[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(difficulties);

        int trim = (int) Math.round(N * 0.15);
        int sum = 0, count = 0;

        for (int i = trim; i < N - trim; i++) { // '<='를 '<'로 수정
            sum += difficulties[i];
            count++;
        }

        int result = (count == 0) ? 0 : (int) Math.round((double) sum / count);
        System.out.println(result);
	}
}
