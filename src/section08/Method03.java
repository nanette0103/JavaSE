package section08;

public class Method03 {
	public static void main(String[] args) {
		
		int result = add (10,5)
		System.out.println("result:"+result);
	}
	
	//7. 인자o 리턴o > 인자값을 받아 실행한 후 반환값을 준다.
	public static int add(int a, int b) {
		return a + b;
	}
	
	//오버로딩 메소드
	public static int add(int a, int b, int c) {
		int result = a+b+c;
		
		return result;
}
