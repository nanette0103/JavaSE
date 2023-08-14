package section11;

import section11.access1.Bus;
import section11.access1.Car;

/*
 * 다형성(Polyorphism)
 * 	같은 인터페이스 또는 부모클래스를 공유하는 객체가 여러 유형의 타입을 가질 수 있는 기능
 * 
 */
public class Polymorphism01 {
	
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.drive();
		bus.bell();
		
		Car car = new Bus();   //껍데기(버튼) = 칩(실행 기능) ();
		car.drive();
//		car.bell();     타입이 car이기 때문에 bus에 있는 bell 호출 불가능
		
		Bus bus2 = (Bus) car; //여기에서의 car는 바로 위의 car와 동일
		bus2.drive();
		bus2.bell();   // 타입이 bus이기 때문에 bell 호출 가능
		
		
	}

}
