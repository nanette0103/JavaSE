package section08;

public class Method02 {
	public static void main(String[] args) {
		
		
		String name = getName();
		
		System.out.println("name:"+name);
		System.out.println("getname():"+getName());
	}
	
	//6. 인자x 리턴o
	public static String getName() {
		String name="피카츄";
		
		return name;
	}

}
