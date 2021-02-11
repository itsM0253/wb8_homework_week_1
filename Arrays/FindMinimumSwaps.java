
public class FindMinimumSwaps {

	public static void main(String[] args) {
	

	}
	
	public static int minimumSwaps(int[] arr) {
		int min_index = 0;
		int min = arr[0];
		int swaps = 0;
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min_index = i;
				min = arr[i];
			}
			if(min_index != 0) {
				int temp = arr[0];
				arr[0] = arr[min_index];
				arr[min_index] = temp;
				swaps++;
			}
		}
	}

}
