package section02;
/*
 * 3. 정수형
 * 	byte	(1byte) : -128 ~ +127
 * 	short	(2byte) : -32,768 ~ +32,767
 * 	int		(3byte) : -2,147,483,648 ~ +2,147,483,647
 * 	long 	(4byte) : -9,223,372,036,854,775,808 ~ +9,223,372,036,854,775,807
 * 
 * 	최대값을 초과하면 최솟값으로 돌아감
 * 
 */

public class Variable03 {
	public static void main(String[] args) {
		// 정수형 번수 선언과 동시에 값 대입하기
		byte nByte = 10;
		short nShort = 100;
		int nInt = 1000;
		long nLong = 10000;
		
		System.out.println("byte 형 : " + nByte); //문자 + 숫자 = 문자
		System.out.println("short 형 :" + nShort);
		System.out.println("int 형 :" + nInt);
		System.out.println("long 형 :" + nLong);
	}

}
