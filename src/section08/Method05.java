package section08;
/*
 * VO(Value Objext), DTO(Data Trancfar Object)
 * 값 오브젝트로써 목적에 맞는 변수의 집합
 * 
 * Database 또는 네트워크 통신 값 운반용으로 사용
 * 
 * 캡슐화(정보은닉) - 객체의 속성과 
 * 
 * strName >낙타표기법
 * str_name>스네이크 표기법
 * 
 * this
 * 자기자신을 참조하는 연산자
 * 
 * 
 * 
 */
public class Method05 {
	public static void main(String[] args) {
		
		MemberVo memberVO = new MemberVo();
		
		memberVO.setId("025");
//		memberVO.setName("피카츄");
		memberVO.setAge(29);
		
		String id = memberVO.getId();
//		String name=memberVO.getName();
//		String age=memberVO.getAge();
		
		System.out.println("id:"+id);
//		System.out.println("Name:"+name);
//		System.out.println("Age:"+age);
		
	}
	
	
	
	
	//System.out.println
	

}
