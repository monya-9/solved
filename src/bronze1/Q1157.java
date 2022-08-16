package bronze1;

import java.util.Scanner;

public class Q1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		str = str.toUpperCase();

		int[] arr = new int[26];

		int max = 0;
		char st = '?';

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - 'A']++;
			if (max < arr[str.charAt(i) - 'A']) {
				max = arr[str.charAt(i) - 'A'];
				st = str.charAt(i);
			} else if (max == arr[str.charAt(i) - 'A']) {
				st = '?';
			}
		}
		System.out.println(st);
	}
}

//����
//���ĺ� ��ҹ��ڷ� �� �ܾ �־�����, �� �ܾ�� ���� ���� ���� ���ĺ��� �������� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, �빮�ڿ� �ҹ��ڸ� �������� �ʴ´�.
//
//�Է�
//ù° �ٿ� ���ĺ� ��ҹ��ڷ� �̷���� �ܾ �־�����. �־����� �ܾ��� ���̴� 1,000,000�� ���� �ʴ´�.
//
//���
//ù° �ٿ� �� �ܾ�� ���� ���� ���� ���ĺ��� �빮�ڷ� ����Ѵ�. ��, ���� ���� ���� ���ĺ��� ���� �� �����ϴ� ��쿡�� ?�� ����Ѵ�.