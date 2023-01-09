package silver5;

public class Q4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		
		for (int i = 1; i < check.length; i++) {
			int num = d(i);
			
			if(num < 10000) {
				check[num] = true;
			}
		}
		
		for (int i = 1; i < check.length-1; i++) {
			if(check[i] == false) {
				System.out.println(i);				
			}			
		}
	}

	public static int d(int n) {
		int sum = n;

		while (n != 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum;
	}
}
