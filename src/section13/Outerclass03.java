package section13;
/*
 * 인스턴스 내부클래스
 * 	기본적인 일반 내부클래스입니다.
 * 	외부클래스 안에 생성되기 때문에 클래스를 사용하려면 
 *  외부클래스 객체가 생성된 상태에서 객체 생성을 할 수 있습니다.
 */
public class Outerclass03 {
	
	public static void main(String[] args) {
		MyUtil mu = new MyUtil();
		MyUtil.HelloPrinter hp = mu.new HelloPrinter();
		hp.PrintHello();
		
	}

}
