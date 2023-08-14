package Section15;

import java.util.Random;

/*
 * 자바 유틸 패키지
 * 	자바에서 유용한 유틸클래스, 인터페이스 포함하는 패키지
 * 
 * Random 클래스
 * 	난수 생성해주는 클래스
 * 
 */
public class JavaUtil01 {
	public static void main(String[] args) {
		
		Random ran = new Random();
		// 0부터 99 사이 정수 중 난수(아무거나) 반환
		int ranNum = ran.nextInt(100);
		System.out.println("난수: " + ranNum);
		
		// 0 이상 1 미만 double 값으로 난수 반환
		if(ran.nextDouble() <0.5) { //50% 확률
			System.out.println("강화에 성공하였습니다.");
		} else {
			System.out.println("강화에 실패하였습니다.");
		}
		
		
	}

}
