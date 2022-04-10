
public class arrays {

	public static void main(String[] args) {
		int [] mylist = new int [10];
		for(int i=0;i<mylist.length;i++) {
			int j=(int) (Math.random() * mylist.length);
			mylist[i]=j;
			//System.out.printf(j+"= "+ mylist[i]);
			
		}
		
		for(int i=0;i<mylist.length;i++) {
			System.out.println(i+"= "+ mylist[i]);
		}
		System.out.println();
		System.out.println("shuffle:");
		System.out.println();
		int temp;
		for(int i=0;i<mylist.length;i++) {
			int j=(int) (Math.random() * mylist.length);
			
			//swap my list
			temp= mylist[i];
			mylist[i]=mylist[j];
			mylist[j]=temp;
		}
		for(int i=0;i<mylist.length;i++) {
			System.out.println(i+"+ "+ mylist[i]);
		}
		temp=mylist[mylist.length-1];
		System.out.println("right shifting:");
		for(int i=1;i<mylist.length;i++) {
			mylist[i+1]=mylist[i];
		}
		mylist[0]=temp;
		for(int i=0;i<mylist.length;i++) {
			System.out.println(i+"+ "+ mylist[i]);
		}
		
	}

}
