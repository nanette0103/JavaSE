package section14.access2;

public class InputErrorException extends Exception{
	
	private String message;
	
	public InputErrorException(String message) {
		this.messege = messege;
	}
	
	@Overiding
	public String getMessage() {
		return this.message;
	}

}
