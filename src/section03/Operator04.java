package section03;
/*
 * 4. 논리 연산자
 * 	&& 	: And 조건, 교집합 개념, 두 항 모두 true 일 때 true
 * 	||	: or 조건, 합집합 개념, 두 항 중 하나 이상 true일 때 true
 * 	!	: Not 조건, 여집합 개념, 논리값(boolean)값 반전 시킨다.
 */
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && true; 
		System.out.println("true && false: " + result);
		
		result = true || false;
		System.out.println("true || false: " + result);
		
		result = !result;
		System.out.println("!result: " + result);
		
		String order = "의류";
		if (order == "식품"||order=="전기전자"||order=="의류") {
			System.out.println("20% 할인 행사 중입니다.");
		} else {
			System.out.println("할인 미적용 상품입니다.");
		}
		
			
	
	}

}
