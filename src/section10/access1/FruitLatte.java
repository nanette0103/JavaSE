package section10.access1;

public class FruitLatte extends Latte {
	public String fruit;
	public String origin;
	
	@Override   //어노테이션 - 클래스 또는 메서드, 필드, 변수, 등에 추가적인 메타 정보 제공
	public void getInfo() {
		// TODO Auto-generated method stub
		super.getInfo();
		System.out.println("Fruit: "+fruit);
		System.out.println("Origin: "+origin);
	}


}
