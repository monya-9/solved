package bronze2;

import java.util.Arrays;
import java.util.Scanner;

public class Q8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] qeRes = new String[size];
		int score = 0;
		int cnt = 0;

		for (int i = 0; i < size; i++) {
			qeRes[i] = sc.next().toUpperCase();
			for (int j = 0; j < size; j++) {
				qeRes[j] = qeRes[i];
				if (qeRes[i].equals("O")) {
					cnt++;
					score += cnt;
				} else {
					cnt = 0;
				}
			}
			System.out.println(score);
		}
	}
}

//����
//"OOXXOXXOOO"�� ���� OX������ ����� �ִ�. O�� ������ ���� ���̰�, X�� ������ Ʋ�� ���̴�. ������ ���� ��� �� ������ ������ �� �������� ���ӵ� O�� ������ �ȴ�. ���� ���, 10�� ������ ������ 3�� �ȴ�.
//
//"OOXXOXXOOO"�� ������ 1+2+0+0+1+0+0+1+2+3 = 10���̴�.
//
//OX������ ����� �־����� ��, ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
//
//�Է�
//ù° �ٿ� �׽�Ʈ ���̽��� ������ �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���̰� 0���� ũ�� 80���� ���� ���ڿ��� �־�����. ���ڿ��� O�� X������ �̷���� �ִ�.
//
//���
//�� �׽�Ʈ ���̽����� ������ ����Ѵ�.