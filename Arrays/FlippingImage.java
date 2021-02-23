import java.util.Arrays;

public class FlippingImage {

	public static void main(String[] args) {
		int[][]  arr = { {1,1,0} };
		invertArray(arr);
		System.out.println(Arrays.deepToString(arr));

	}
	
	public static int[][] invertArray(int[][] a) {
		int columns = a[0].length; // is the length of an element in the array
		for(int i = 0; i < a.length; i++) {
		    // reverse
			for(int j = 0; j < columns/2; j++) {
				int temp = a[i][j];
				a[i][j] = a[i][columns - j -1]; // last value
				a[i][columns - j -1] = temp;
			}
			// time to replace 0's with 1's and 1's with 0's
			for(int k = 0; k < columns; k++) {
				if(a[i][k] == 1) {
					a[i][k] = 0;
				}
				else if(a[i][k] == 0) {
					a[i][k] = 1;
				}
			}
		}
		return a;
	}
	
}
