package section13;
/*
 * 이너 클래스(Inner Class)
 * 클래스 안에 만들어진 또다른 중첩 클래스
 * 외부클래스와 밀접한 관계를 가진다.
 * 
 * 
 * 정적(static) 내부 클래스 선언
 * Outer.inner in = new Outer.Inner();
 * 외부 클래스 생성 없이 바로 접근 가능
 *
 */
public class OuterClass01 {
	
	public static void main(String[] args) {
		//객체 생성 없이 외부 클래스를 통해 접근할 수 있다.
		OuterClass01.InnerClass.info();
		
		//같은 클래스 안에서는 바로 접근 가능
		innerclass.info();
		
	}
	// 정적클래스- 외부 클래스 변수와 같이 static 키워드 부여
	static class InnerClass{
		public static void info() {
			System.out.println("static 내부 클래스 입니다.");
		}
	}

}
