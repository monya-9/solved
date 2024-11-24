package silver4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q1018 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());	//세로줄 크기
		int M = Integer.parseInt(st.nextToken());	//가로줄 크기
		
		String[] chessBoard = new String[N];
		
		for (int i = 0; i < N; i++) {
			chessBoard[i] = br.readLine();
		}
		br.close();
		
		int count = Integer.MAX_VALUE;	// 가장 큰 값으로 초기화
		for (int i = 0; i <= N-8; i++) {
			for (int j = 0; j <= M-8; j++) {
				int resultCount = getMinCost(i, j, chessBoard);
				
				if(count > resultCount) {
					count = resultCount;
				}
			}
		}
		
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}

	private static int getMinCost(int startRow, int startCol, String[] chessBoard) {
		String[] board = {"WBWBWBWB", "BWBWBWBW"}; // 화이트, 블랙
		
		int whiteVerCount = 0;	//화이트를 기준으로 최소 비용
		
		for (int i = 0; i < 8; i++) {	// 세로
			int row = startRow + i;	// 선택된 체스판 안에서의 인덱스
			
			for (int j = 0; j < 8; j++) {	// 가로
				int col = startCol + j;
				
				if (chessBoard[row].charAt(col) != board[row%2].charAt(j)) {
					whiteVerCount++;
				}
			}
		}
		// 64 - WhiteVerCount 블랙 최소값
		// 화이트와 블랙 중 더 작은 최소값을 Return
		return Math.min(whiteVerCount, 64-whiteVerCount);
	}
}