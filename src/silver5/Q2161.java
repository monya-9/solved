package silver5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Q2161 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		
		for (int i = 1; i < N+1; i++) {
			queue.offer(i);
		}
		for (int j = 0; j < N; j++) {
			System.out.println(queue.poll());
			if(queue.peek() != null) {
				int in = queue.peek();
				queue.poll();
				queue.offer(in);				
			} else {
				break;
			}
		}
	}
}
