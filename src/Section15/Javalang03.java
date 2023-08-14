package Section15;
/*
 * String클래스
 * 자바에서 문자열을 다루기 위한 클래스
 * 
 * 불변의 객체 - 생성된 후 메모리에서 문자열 값이 변경되지 않는다. (변경불가 객체)
 */

public class Javalang03 {
	public static void main(String[] args) {
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		
		System.out.println(str1);
		System.out.println(str1.toString());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		str2 += "d";
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println("==================================");

		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		System.out.println("str3:"+str3);
		
		
		if(str1 == str2) {
			System.out.println("str1==str2 true");
		} else {
			System.out.println("str1==str2 false");
		}
		
		if(str1 == str3) {
			System.out.println("str1==str3 true");
		} else {
			System.out.println("str1==str3 false");
		}
		
		
		if(str1 == str3) {
			System.out.println("str1.equals str3 true");
		} else {
			System.out.println("str1.equals str3 false");
		}
	}

}
