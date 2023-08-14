package section09;

public class Ani {
	public String title;
	public String genre;
	public int runTime;
	public boolean IsAdult;
	
	public Ani(String title, 
			String genre, 
			int runtime, 
			boolean IsAdult) {
		
		this.title=title;
		this.genre=genre;
		this.runTime=runtime;
		this.IsAdult=IsAdult;
	}
	
	public void getInfo() {
		System.out.println("title:"+title);
		System.out.println("genre:"+genre);
		System.out.println("runtime:"+runTime);
		System.out.println("IsAdult:"+IsAdult);
	}
	

}
