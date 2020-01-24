package Pracpack;
import java.util.ArrayList;
public class Box {
	private ArrayList<Giftcard> giftcard = new ArrayList<Giftcard>();
	int weight;
	int width;
	int height;
	private int capacity;
	
	public Box() {
		weight = 0;
		width = 0;
		height = 0;
	}
	
	public Box(int weight,int width,int height) {
		this.weight = weight;
		this.width = width;
		this.height = height;
	}
	
	public Box(int side,int weight) {
		this.width = side;
		this.height = side;
		this.weight = weight;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public void addGiftCard(Giftcard gc) {
		if (giftcard.size() < capacity) {
			giftcard.add(gc);
		}
		else {
			System.out.println("This box is full!");
		}
	}
	
	public void showGiftCards() {
		System.out.println(giftcard.size());
	}
	
}

