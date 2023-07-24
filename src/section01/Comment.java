package section01;
/*
 * 코드에 영향을 주지 않는 개발자가 사용하는 메모 공간
 * 줄삭제 : ctrl + d
 * 
 *  Alt + shift + j : Javadoc 주석
 */

 
/**
 * Javadoc 주석
 * 
 * 입력받은 정수 출력하는 메소드
 * 
 * @param args
 */
public class Comment {
	public static void main(String[] args) {
//		한줄 주석
		System.out.println("Hello, Java!");
	}

public static void printNum(int num) {
		System.out.println("num: "+num);
	}
}