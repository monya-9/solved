package silver5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Q1181 {
	public static void main(String[] args) {
		// �迭 ũ�� ����
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] str = new String[size];

		// ���� �޾ƿ���
		for (int i = 0; i < size; i++) {
			str[i] = sc.next();
		}

		// ����, ���� ���� ����
		Arrays.sort(str, new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});

		// ����ϱ�
		System.out.println(str[0]);
		// �ߺ� ����
		for (int i = 1; i < size; i++) {
			if (!str[i].equals(str[i - 1])) {
				System.out.println(str[i]);
			}
		}
	}
}

//����
//���ĺ� �ҹ��ڷ� �̷���� N���� �ܾ ������ �Ʒ��� ���� ���ǿ� ���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//���̰� ª�� �ͺ���
//���̰� ������ ���� ������
//�Է�
//ù° �ٿ� �ܾ��� ���� N�� �־�����. (1 �� N �� 20,000) ��° �ٺ��� N���� �ٿ� ���� ���ĺ� �ҹ��ڷ� �̷���� �ܾ �� �ٿ� �ϳ��� �־�����. �־����� ���ڿ��� ���̴� 50�� ���� �ʴ´�.
//
//���
//���ǿ� ���� �����Ͽ� �ܾ���� ����Ѵ�. ��, ���� �ܾ ���� �� �Էµ� ��쿡�� �� ������ ����Ѵ�.