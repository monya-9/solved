package bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Q12605 {
	public static void main(String[] args) throws IOException {	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		
		Stack<String> stack = new Stack<>();
		
		for (int i = 0; i < N; i++) {
			String[] str = bf.readLine().split(" ");				
				System.out.print("Case #" + (i+1) + ": ");
			for (int j = 0; j < str.length; j++) {
				stack.push(str[j]);
			}
			for (int j = 0; j < str.length; j++) {
				System.out.print(stack.peek() + " ");
				stack.pop();
			}
			System.out.println();
		}
	}
}


//문제
//스페이스로 띄어쓰기 된 단어들의 리스트가 주어질때, 단어들을 반대 순서로 뒤집어라. 각 라인은 w개의 영단어로 이루어져 있으며, 총 L개의 알파벳을 가진다. 각 행은 알파벳과 스페이스로만 이루어져 있다. 단어 사이에는 하나의 스페이스만 들어간다.
//
//입력
//첫 행은 N이며, 전체 케이스의 개수이다.
//
//N개의 케이스들이 이어지는데, 각 케이스는 스페이스로 띄어진 단어들이다. 스페이스는 라인의 처음과 끝에는 나타나지 않는다. N과 L은 다음 범위를 가진다.
//
//N = 5
//1 ≤ L ≤ 25
//출력
//각 케이스에 대해서, 케이스 번호가 x일때  "Case #x: " 를 출력한 후 그 후에 이어서 단어들을 반대 순서로 출력한다.