
public class NumberOfProvinces {

	public static void main(String[] args) {
		int[][]  isConnected = { {1,1,0},
				 			     {1,1,0},
				 			     {0,0,1}};
		int result = findNumOfProvinces(isConnected);
		System.out.println(result);
		 

	}
	
	public static int findNumOfProvinces(int[][] a) {
		int[] visted = new int[a.length]; // created a 1 dimensional array with length of 3
//		System.out.println(a.length);
		int num = 0; // counts how many provinces
		for(int i = 0; i < a.length; i++) { // looping through every city (rows)
			if(visted[i] == 0) { // pay closed attention visited[i] keeps track of the city(row) 
				helper(a, visted, i);
				num++; 
			}
		}
		return num;
	}
	
	// if A - A is = 1, that means it's not visited
	public static void helper(int[][] a, int[] visted, int i) { // i is the current city
		for(int j = 0; j < a.length; j++) { // looking through every city's connection the columns
			if(a[i][j] == 1 && visted[j] == 0) { // visited[j] is checking the the column for the current city where at for example, A to A.
				visted[j] = 1; // now you have to update visited because it has a connection 
				helper(a,visted,j); // this will search the connection connections (A-B it will go the B city and search that)
			}
		}
	}

}
