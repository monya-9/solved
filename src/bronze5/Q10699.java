package bronze5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q10699 {
	public static void main(String[] args) {
		// ���� ��¥ ���ϱ� (�ý��� �ð�, �ý��� Ÿ����)
		LocalDate now = LocalDate.now();

		//���� ����
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		
		//���� ����
		String formatedNow = now.format(formatter);

		//��� ���
		System.out.println(formatedNow);
	}
}


//����
		// ������ ���� ��¥�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//
		// �Է�
		// �Է��� ����.
		//
		// ���
		// ������ ���� ��¥�� "YYYY-MM-DD" �������� ����Ѵ�.

