package section08;
/*
 * 메서드 (Method)
 * 
 * 
 *** 오버로딩(Overloading)
 * 	클래스 내에서 같은 이름을 가진 메서드를 여러개 정의하는 것을 말한다.
 *  매개변수 개수 또는 타입이 다르면 선언 가능.
 * 
 * 
 * 
 */
public class Method01 {
	public static void main(String[] args) {
		hello(); //hello 메서드 호출
		
		printName("도라에몽");
		
		printPoketMon("025", "피카츄", 29);
		printPoketMon("025", "피카츄", "전기");
		
		String[] pokemons= {"피카츄","라이츄","파이리","꼬부기"};
		printPokeMon(Pokemons);
		
		
		
	}
	//1.인자x 리턴x -호출시 실행하고 끝나는 메서드
	public static void hello() {
		System.out.println("Hello, World!");
		
	}
	
	// 2. 인자o 리턴x
	public static void printName(String name) {
		System.out.println("이름:" +name);
	}
	
	// 3. 인자o 여러개 여러타입 리턴x
	public static void printPoketMon(String id, String name, int age) {
		System.out.println("ID:"+id);
		System.out.println("Name:"+name);
		System.out.println("Age:" +age);
	}
	
	// 4.오버로딩(Overloading) 메서드
		public static void printPoketMon(String id, String name, String type) {
			System.out.println("ID:"+id);
			System.out.println("Name:"+name);
			System.out.println("type:" +type);
		}
		
		public static void printPokeMon(String[] mons) {
//			for (String mon:mons)
//				System.out.println(mon);
//		}
	
			for(int i=0; i<mons.length; i++)
				String mon = mons[i];
			System.out.println(mon);
	

}
