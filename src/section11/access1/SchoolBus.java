package section11.access1;

public class SchoolBus extends Bus{
	
	public SchoolBus() {
		type = "스쿨버스";
		color = "Yellow";
		
	}
	
	@Override
	public void drive() {
		System.out.println("");
	}
}
	