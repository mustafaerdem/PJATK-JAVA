public class ERDEM{
public static void main(String[] args) {
		
		int number,largest;
		int [] arr = {1 ,5, 8, 2, 6};
		largest = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		
		number = largest;
		for(int i=0;i<number;i++)
	    {
	        for(int j=0;j < arr.length ;j++)
	            if(arr[j]<largest)
	                System.out.print("  ");
	            else
	                System.out.print("* ");
	        largest--;
	        System.out.println();
	    }
	
	}

}
