package bronze3;

import java.util.Scanner;

public class Q2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[9];

		int maxVal = 0;
		int pos = 0;
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			if(num[i] > maxVal) {
				maxVal = num[i];
				pos = i;
			}
		}
		System.out.println(maxVal);
		System.out.println(pos+1);
	}
}

//����
//9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//���� ���, ���� �ٸ� 9���� �ڿ���
//
//3, 29, 38, 12, 57, 74, 40, 85, 61
//
//�� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
//
//�Է�
//ù° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�.
//
//���
//ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
