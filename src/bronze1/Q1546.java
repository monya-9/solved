package bronze1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Q1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float[] cre = new float[n];
		float maxVal = 0;
		float avg = 0;
		
		for(int i=0; i<cre.length; i++) {
			cre[i] = sc.nextInt();
			if(cre[i]>maxVal) {
				maxVal = cre[i];
			}
		}
		
		for(int i=0; i<cre.length; i++) {
			avg += (cre[i]/maxVal*100)/n;
		}
		System.out.println(avg);
		
		
//		Scanner sc = new Scanner(System.in);
//		int size = sc.nextInt();
//		int[] n = new int[size];
//		double[] cn = new double[size];
//		double sum = 0;
//
//		for (int i = 0; i < n.length; i++) {
//			int cre = sc.nextInt();
//			if (cre > 100 || cre < 0) {
//				System.out.println("���Է�");
//				i--;
//			} else {
//				cn[i] = cre;
//			}
//		}
//
//		for (int i = 0; i < cn.length - 1; i++) {
//			for (int j = 0; j < cn.length - 1 - i; j++) {
//				if (cn[j] < cn[j + 1]) {
//					double tmp = cn[j];
//					cn[j] = cn[j + 1];
//					cn[j + 1] = tmp;
//				}
//			}
//		}
//
//		double maxVal = cn[0];
//		
//		for (int i = 0; i < cn.length; i++) {
//			cn[i] = cn[i] / maxVal * 100;
//		}
//
//		for(int i=0;i<cn.length;i++)
//		{ sum+=cn[i];
//		       }
//		double avg=sum/(cn.length);
//		System.out.println(avg);
		
		
	}
}



//����
////�����̴� �⸻��縦 ���ƴ�. �����̴� ������ �����ؼ� ���� ��������� �ߴ�. �ϴ� �����̴� �ڱ� ���� �߿� �ִ��� �����. �� ���� M�̶�� �Ѵ�. �׸��� ���� ��� ������ ����/M*100���� ���ƴ�.
////
////���� ���, �������� �ְ����� 70�̰�, ���������� 50�̾����� ���������� 50/70*100�� �Ǿ� 71.43���� �ȴ�.
////
////�������� ������ ���� ������ ���� ������� ��, ���ο� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
////
////�Է�
////ù° �ٿ� ���� �� ������ ���� N�� �־�����. �� ���� 1000���� �۰ų� ����. ��° �ٿ� �������� ���� ������ �־�����. �� ���� 100���� �۰ų� ���� ���� �ƴ� �����̰�, ��� �ϳ��� ���� 0���� ũ��.
////
////���
////ù° �ٿ� ���ο� ����� ����Ѵ�. ���� ����� ��°��� ������� �Ǵ� �������� 10-2 �����̸� �����̴�.
