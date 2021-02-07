import java.util.Arrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		int[][]  arr = { {1,2,3},
				 	   {4,5,6}};
		
		transpose(arr);
		System.out.println(Arrays.deepToString(arr));

	}
	
	public static int[][] transpose(int[][] a) {
		int rows = a.length; // the arrays length is how many elements TOTAL in the array
		System.out.println(rows);
		int columns = a[0].length; // is the length of an element in the array
		System.out.println(columns);
		/*
		 * 2d arrays are created rows 1st then columns second
		 * Created a new array matrix which now How many rows is going to be dependent on # of columns
		 * and how many columns is going to be dependent on # of rows
		 */
		int[][] matrix = new int[columns][rows]; // a new 2D array with columns & rows
		
		for(int i = 0; i < rows; i++) { // traversing through each row 
			for(int j = 0; j < columns; j++) { // traversing through the columns of that row
				matrix[j][i] = a[i][j]; // you are giving to fill up the vertically the columns and work your way
			}
		}
		return matrix;
		
	}

}
