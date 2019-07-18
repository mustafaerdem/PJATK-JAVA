import java.util.Arrays;
public class TASK6 {
    
public static int[][] inner(int[][] arr){
		int [][] result = new int[arr.length-2][arr[0].length-2];
		for(int i=1;i<arr.length-1;i++){
			for(int j=1;j<arr[0].length-1;j++){
				result[i-1][j-1]=arr[i][j];
			}
		}
		return result;
	}
            
	public static void main(String[] args) {
		int[][] a = { { 1, 2, 3, 4, 5, 6 }, 
                              { 2, 3, 4, 5, 6, 7 }, 
                              { 3, 4, 5, 6, 7, 8 }, 
                              { 4, 5, 6, 7, 8, 9 } };
		for (int[] r : a)
                        System.out.println(Arrays.toString(r));
                    System.out.println();
                    
		for (int[] r : inner(a))
                    System.out.println(Arrays.toString(r));
	}
}

