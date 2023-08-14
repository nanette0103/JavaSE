package section13.access1;

public class MyUtil {
	
	public string str1 = "일반멤버 변수";
	public static String str1 = "정적멤버 변수";
	
	public class HelloPrinter{
		public void printHello() {
			System.out.println("인스턴스 내부 클래스 HelloPrinter입니다.");
		}
	}
	
	public static class Calculater {
		public void calc(int a, int b) {
			System.out.println("전달받은 두 정수의 합:"+(a+b));
		}
	}

}
