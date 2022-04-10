package week13;

public class binary_serch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array1= {6,4,7,2,9,1,5};
		int key=5;//searching for this number location e.g. number 5 location in the array is 6
		System.out.println("Location for "+key+" is "+findKey(array1,key));
	}
	public static int findKey(int[] array, int key) {
		int location= -1;
		for(int i=0;i<array.length;i++) {
			if(key == array[i]) {
				location=i;
			}
			
		}
		return location;
	}

}

