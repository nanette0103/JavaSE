package section09;

public class Game {
	
	public String title;
	public String player;
	public String bankmoney;
	public String chanceCard;
	
	public Game() {
		this.title = "브루마블";
		this.player= "파란 비행기";
		this.bankmoney= "5000만원";
		this.chanceCard="월급을 받으세요";
		}
	
	public void getInfo() {
		System.out.println("title:"+title);
		System.out.println("player:"+player);
		System.out.println("bankmoney:"+bankmoney);
		System.out.println("chanceCard:"+chanceCard);
		
	}
	

}
