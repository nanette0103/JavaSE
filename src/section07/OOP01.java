package section07;
/*
 * OOP (object Oriented Programing)
 * 객체 지향 프로그래밍
 * 프로그램을 작성할 때 데이터와 데이터를 조작하는 메소드(함수)를 하나의 논리적 단위 개체로 묶는 방식
 * 
 * 객체(object)
 * 	물리적으로 존재하거나 추상적으로 생각할 수 있는 것
 * 	정의 가능하고 식별 가능한 것을 말한다.
 * 
 * 예) 물리적 - 컴퓨터, 휴대폰, 학생, 회원
 * 		추상적 - 주문(영수증), 게임유닛, 회계 장부,
 * 
 * 객체의 구성요소
 * 	1. 속성 = 변수
 * 	2. 기능 = 메소드
 * 
 * 예) 자동차 객체
 * 		속성 1) 모델명
 * 				가격
 * 				색상
 * 		기능 2) 자율주행( )
 * 				
 * Class 
 * 객체를 만들ㅇ기 위한 설계도
 * Class에 작성된 코드를 읽어 인스턴스(객체) -> 메모리에 저장한다 또는 올린다
 * 
 * 클래스 구조
 * 
 * 
 */
public class OOP01 {
	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		Car2.color = "blue";
				
		System.out.println(car1.color);
		System.out.println(car2.color);
		System.out.println(car1.wheel);
		System.out.println(car2.wheel);
		System.out.println(car1.model);
		System.out.println(car2.model);
	
	car1.autopilot();
	car1.drive();
	
	}

}
