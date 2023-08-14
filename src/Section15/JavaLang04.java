package Section15;
/*
 * StrjngBuffer  - Thread Safe O
 * StringBuilde  - Thread Safe X
 * 	문자열을 동적으로 다루기 위한 클래스
 */

public class JavaLang04 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		
		StringBuilder sBuilder = new StringBuilder();

		
		sBuilder.append("안녕하세요");
		System.out.println(sBuilder);
		System.out.println(System.identityHashCode(sBuilder));
		sBuilder.append("Hello java");
		System.out.println(sBuilder);
		System.out.println(System.identityHashCode(sBuilder));
	}

}
