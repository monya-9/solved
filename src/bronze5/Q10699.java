package bronze5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q10699 {
	public static void main(String[] args) {
		// 현재 날짜 구하기 (시스템 시계, 시스템 타임존)
		LocalDate now = LocalDate.now();

		//포맷 정의
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
		
		//포맷 적용
		String formatedNow = now.format(formatter);

		//결과 출력
		System.out.println(formatedNow);
	}
}


//문제
		// 서울의 오늘 날짜를 출력하는 프로그램을 작성하시오.
		//
		// 입력
		// 입력은 없다.
		//
		// 출력
		// 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.

