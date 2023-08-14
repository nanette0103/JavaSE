package Section15;

public class Singleton {
	//정적 변수로 인스턴스 저장
	private static Singleton instance;
	
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		
		return instance;
	}

}
