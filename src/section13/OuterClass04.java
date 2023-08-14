package section13;
/*
 * 지역 내부 클래스
 * 	메서드 내에서 선언되어 사용되는 클래스이다.
 * 	메서드 내에서만 사용 가능
 * 	메서드 종료시 클래스도 사용 종료
 * 
 */

public class OuterClass04 {

	private int speed = 10;
	public void getUinit(String Unitname) {
		
		class Unit {
			public void move() {
				System.out.println(unitname + "이 "+ speed + " 속도로 이동합니다.");
			}
		}
		Unit unit = new Unit();
		unit.move();
		
	}
	public static void main(String[] args) {
		OuterClass04 outer = new
	}
}
