

public class sorting {
	public static int size1 =  50;
	public static int size2 =  100;
	public static int size3 =  500;
	public static int size4 =  1000;
	public static int size5 =  5000;
	public static int size6 =  10000;
	public static int size7 =  50000;
	public static int size8 =  100000;
	public static int size9 =  500000;
	public static int size10 = 1000000;
	
	public static void bubble_sort(int array[],int size){
		int  c, d, swap;
		/*time should start here*/
		long startTime = System.currentTimeMillis();
		for (c = 0 ; c < ( size - 1 ); c++)
		{
			for (d = 0 ; d < size - c - 1; d++)
			{
				if (array[d] > array[d+1])
				{
			        swap       = array[d];
			        array[d]   = array[d+1];
			        array[d+1] = swap;
				}
			}
		}
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.printf("%d\t%d\t",size,elapsedTime);
	}
	
	public static void insertion_sort(int array[],int size){
		int i,j,temp,loc,min;
		long startTime = System.currentTimeMillis();
		for(i=0;i<(size-1);i++){
			min=array[i];
		 	loc=i;
		 	for(j=i+1;j<size;j++){
		 		if(array[j]<min){
		 			min=array[j];
		 			loc=j;
				 }
			 }
			 temp=array[i];
			 array[i]=array[loc];
			 array[loc]=temp;
		 }
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		 System.out.printf("%d\t\t",elapsedTime);
	 }
	
	 public static void selection_sort(int array[],int size){
		 int c, d, position, swap;
		 long startTime = System.currentTimeMillis();
		 for ( c = 0 ; c < ( size - 1 ) ; c++ )
		 {
		      position = c;
		
		      for ( d = c + 1 ; d < size ; d++ )
		      {
		         if ( array[position] > array[d] )
		            position = d;
		      }
		      if ( position != c )
		      {
		         swap = array[c];
		         array[c] = array[position];
		         array[position] = swap;
		      }
	   }
		 long stopTime = System.currentTimeMillis();
		 long elapsedTime = stopTime - startTime;
		 System.out.printf("%d\t\t",elapsedTime);
	}
	 
	 public static void shell_sort(int a[],int size){
		 int i, n;
		 int  j, increment, tmp;
		 long startTime = System.currentTimeMillis();
		 for(increment = size/2; increment > 0; increment /= 2)
		 {
			 for(i = increment; i < size; i++)
			 {
				 tmp = a[i];
				 for(j = i; j >= increment; j -= increment)
				 {
					 if(tmp < a[j-increment])
						 a[j] = a[j-increment];
					 else
						 break;
				 }
				 a[j] = tmp;
			 }
		 }
		 long stopTime = System.currentTimeMillis();
		 long elapsedTime = stopTime - startTime;
		 System.out.printf("%d\t\t\n",elapsedTime);
	 }
	 
	public static void main(String[] args) {
	    	System.out.printf("number\tbubble\tinsertion\tselection\tshell\n");
	    	int array1[] = new int[size1];
	    	int counter = 0;
	    	for(counter=0;counter<size1;counter++){
	    		array1[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array1,size1);
	    	insertion_sort(array1,size1);
	    	selection_sort(array1,size1);
	    	shell_sort    (array1,size1);

	    	int array2[] = new int[size2];
	    	for(counter=0;counter<size2;counter++){
	    		array2[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array2,size2);
	    	insertion_sort(array2,size2);
	    	selection_sort(array2,size2);
	    	shell_sort    (array2,size2);

	    	int array3[] = new int[size3];
	    	for(counter=0;counter<size3;counter++){
	    		array3[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array3,size3);
	    	insertion_sort(array3,size3);
	    	selection_sort(array3,size3);
	    	shell_sort    (array3,size3);

	    	int array4[] = new int[size4];
	    	for(counter=0;counter<size4;counter++){
	    		array4[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array4,size4);
	    	insertion_sort(array4,size4);
	    	selection_sort(array4,size4);
	    	shell_sort    (array4,size4);

	    	int array5[] = new int[size5];
	    	for(counter=0;counter<size5;counter++){
	    		array5[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array5,size5);
	    	insertion_sort(array5,size5);
	    	selection_sort(array5,size5);
	    	shell_sort    (array5,size5);

	    	int array6[] = new int[size6];
	    	for(counter=0;counter<size6;counter++){
	    		array6[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array6,size6);
	    	insertion_sort(array6,size6);
	    	selection_sort(array6,size6);
	    	shell_sort    (array6,size6);

	    	int array7[] = new int[size7];
	    	for(counter=0;counter<size7;counter++){
	    		array7[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array7,size7);
	    	insertion_sort(array7,size7);
	    	selection_sort(array7,size7);
	    	shell_sort    (array7,size7);

	    	int array8[] = new int[size8];
	    	for(counter=0;counter<size8;counter++){
	    		array8[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array8,size8);
	    	insertion_sort(array8,size8);
	    	selection_sort(array8,size8);
	    	shell_sort    (array8,size8);

	    	int array9[] = new int[size9];
	    	for(counter=0;counter<size9;counter++){
	    		array9[counter] = (int) (Math.random()*99)+1;
	    	}
	    	bubble_sort   (array9,size9);
	    	insertion_sort(array9,size9);
	    	selection_sort(array9,size9);
	    	shell_sort    (array9,size9);

	    /*int array10[] = new int[size10];
	    for(counter=0;counter<size10;counter++){
	        array10[counter] = (int) (Math.random()*99)+1;
	    }
	    bubble_sort   (array10,size10);
	    insertion_sort(array10,size10);
	    selection_sort(array10,size10);
	    shell_sort    (array10,size10);*/
	}

}
