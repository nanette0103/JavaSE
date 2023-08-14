package Section15;

import java.util.Calendar;

/*
 * Calendar 클래스
 * 	시간과 날짜 정보를 다루는 클래스
 * 	날짜 시간 계산으로 자주 사용
 * 	date 객체화 호환가능
 * 
 * 
 */
public class JavaUtil04 {
	public static void main(String[] args) {
		
		// 객체생성 getInstance()를 통해 해야한다.
		Calendar Cal = Calendar.getInstance(); 
	
		int year = Cal.get(Calendar.YEAR);
		System.out.println("올 해 :" year);
		
		int month = Cal.get(Calendar.MONTH);
		System.out.println("월 :" month);
		
		int DAY = Cal.get(Calendar.DAY);
		System.out.println("일 :" day);
		
		int hour = Cal.get(Calendar.HOUR_OF_DAY);
		int min = Cal.get(Calendar.MINUTE);
		int sec = Cal.get(Calendar.SECOND);
		System.out.println(hour + min + sec);
	
	}

}
