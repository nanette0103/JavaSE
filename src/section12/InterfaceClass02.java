package section12;
/*
 * 인터페이스 상속
 * 		인터페이스끼리 상속 관계를 만들 수 있따.
 * 		Extends 키워드 사용한다.
 * 		다중 상속이 가능하다 (,) 사용
 */
public class InterfaceClass02 {
	public static void main(String[] args) {
		System.out.println("---TJmic객체---");
		TJmic tj = new TJmic();
		tj.connet();
		tj.music();
		tj.sing();
		
		System.out.println("---BluetoothMIC로 타입 변환---");
		BluetoothMIC bm = tj;
		bm.connet();
		bm.music();
		bm.sing();
		
		System.out.println("---Microphone으로 타입 변환---");
		Microphone m = tj ;
//		m.connet();
//		m.music();
		m.sing();
		
		System.out.println("--Speaker로 타입 변환--");
		Speaker s = tj;
		// s.connect();
		s.music();
		// s.sing();
	
	}

}
