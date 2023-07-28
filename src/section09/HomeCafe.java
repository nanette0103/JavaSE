package section09;

public class HomeCafe {
	public String drink;
	public int price;
	public String type;
	
	public HomeCafe() {
		this.drink = "아메리카노";
		this.price = 4000;
		this.type="Coffe";
	}
	
	public void getInfo() {
		System.out.println("drink:"+drink);
		System.out.println("price:"+price);
		System.out.println("type:"+type);
	}

}
