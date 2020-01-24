package Pracpack;

public class main {

	public static void main(String[] args) {
		
		Giftcard one = new Giftcard("rec1","send1","msg1");
		Giftcard two = new Giftcard("rec2","send2","msg2");
		Giftcard three = new Giftcard("rec3","send3","msg3");
		
		System.out.println(two.getMsg());
		
		Box box1 = new Box();
		Box box2 = new Box(10,4,5);
		Box box3 = new Box(2,6);
		
		System.out.println(box1.weight);
		System.out.println(box1.height);
		System.out.println(box1.width);
		
		box2.setCapacity(3);
		box3.setCapacity(2);
		
		box2.getCapacity();
		System.out.println(box2.getCapacity());
		
		box2.addGiftCard(one);
		box2.addGiftCard(two);
		box2.addGiftCard(three);
		
		box3.addGiftCard(one);
		box3.addGiftCard(two);
		box3.addGiftCard(three);
		
		box3.showGiftCards();
		
		
		
	}

}
