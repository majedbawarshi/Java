package shuffiling_shifting;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  mylist = new int [10];
		for (int i = 0; i< mylist.length-1; i++) {
			int j = (int)( Math.random() * mylist.length);
			//Scanner input = new Scanner (System.in);
			//System.out.println("please enter values" + i + " = ");
			//mylist[i] = input.nextInt();
			mylist[i] = j;
			//System.out.println(j + "= " + mylist[i]);
			//System.out.println(i + "=" + mylist[i]);
		
		}
		for (int i = 0; i< mylist.length; i++) {
			System.out.println(i + "= " + mylist[i]);
		}
		System.out.println("shuffle");
		
		for (int i = 0; i< mylist.length; i++) {
			int j = (int)( Math.random() * mylist.length);
			int temp;
			// swap my list
			temp = mylist[i];
			mylist[i] = mylist[j];
			mylist[j] = temp;
		}
		for (int i = 0; i< mylist.length; i++) {
			System.out.println(i + "+ " + mylist[i]);
		}
		int temp = mylist[0];
		System.out.println("left shifting");
		for (int i = 1; i< mylist.length; i++) {
			mylist[i-1] = mylist[i];
		}
		mylist[mylist.length-1] = temp;
		for (int i = 0; i< mylist.length; i++) {
			System.out.println(i + "+ " + mylist[i]);
		}
		temp = mylist[mylist.length-1];
		System.out.println("right shifting");
		for (int i = mylist.length-1; i>0; i--) {
			//System.out.println(i + "== " +  mylist[i]);
			mylist[i] = mylist[i-1];
		}
		mylist[0] = temp;
		for (int i = 0; i< mylist.length; i++) {
			System.out.println(i + "+ " + mylist[i]);
		}
	}

}
