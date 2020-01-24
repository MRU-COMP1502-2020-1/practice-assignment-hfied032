package Pracpack;

public class Giftcard {
	private String reciever;
	private String sender;
	private String message;
	
	public Giftcard(String reciever,String sender,String message) {
		this.reciever = reciever;
		this.sender = sender;
		this.message = message;
	}
	
	public String getMsg() {
		return message;
	}
	
	
}
