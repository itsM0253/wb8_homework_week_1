
public class NumberOfProvinces {

	public static void main(String[] args) {
		int[][]  isConnected = { {1,1,0},
				 			     {1,1,0},
				 			     {0,0,1}};
		int result = findNumOfProvinces(isConnected);
		System.out.println(result);
		 

	}
	
	public static int findNumOfProvinces(int[][] M) {
		int count = 0;
		for(int i = 0; i < M.length; i++) {
			if(M[i][i] == 1) {
				count++;
				dfs(M,i);
			}
		}
		return count;
	}
	
	public static void dfs(int[][] M, int v) {
		if(M[v][v] == 0) {
			return;
		}
		for(int i = 0; i < M.length; i++) {
			if(M[v][i] == 1) {
				M[v][i] = 0;
				dfs(M,i);
			}
		}
	}

}
