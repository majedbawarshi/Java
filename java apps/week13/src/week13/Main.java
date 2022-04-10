package week13;

public class Main {

	public static void main(String[] args) {
		//TODO auto-generated method stub
	
		int[] deck = new int[52];
		// create a list of the shapes
		String[] suits= {"Spades","Hearts","Diamonds","Clubs"};
		String[] ranks= {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
		//populate the arry
		for(int i =0;i<deck.length;i++) {
			deck[i]=i;
		}
		for(int i =0;i<deck.length;i++) {
			int temp;
			int j=(int)(Math.random()*52);
			temp=deck[j];
			deck[i]=deck[j];
			deck[j]=temp;
		}
		for(int i =0;i<deck.length;i++) {
			System.out.println(i+"="+deck[i]);
		}
		for(int i =0;i<4;i++) {
			int cardnumber=deck[i]%13;
			int cardsuit=deck[i]/13;
			System.out.println((i+1)+" - your card is "+ suits[cardsuit]+" and "+ ranks[cardnumber]);
		}

		}
}
