package silver3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		int num = M;
		boolean[] mn = new boolean[N + 1];
		mn[0] = mn[1] = true;

		for (int i = 2; i * i <= N; i++) {
			if (mn[i] == true) {
				continue;
			}
			for (int j = i + i; j <= N; j += i) {
				mn[j] = true;
			}
		}
		for (int j = M; j <= N; j++) {
			if (mn[j] == false) {
				bw.write(j + "\n");
			}
		}
		bw.flush();
	}
}
