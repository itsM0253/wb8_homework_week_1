
public class Arrray2DPractice {

	public static void main(String[] args) {
		int[][]  arr = { {2,4,-1},
			    				 {-10,5,4},
			    				 {18,-7,6}};
		
		for(int i = 0; i < arr.length; i++) { // row
			for(int j = 0; j < arr.length; j++) { // column
				System.out.print(arr[i][j] + " " + " ");
			}
		}

	}

}
