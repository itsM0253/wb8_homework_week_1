import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] a1 = {1,2,3};
		int[] a2 = {1,2,9};
		int[] a3 = {9,9};
	    
		System.out.println(Arrays.toString(plusOne(a1)));
		System.out.println(Arrays.toString(plusOne(a2)));
		System.out.println(Arrays.toString(plusOne(a3)));
		

	}
	
	public static int[] plusOne(int[] arr) {
		// traverse through the array from the back
		for(int i = arr.length - 1; i >= 0; i--) {
			// if the last digit is not a 9, just increment it to +1
			if(arr[i] < 9) {
				arr[i] = arr[i] + 1;
				return arr;
			}
			// else if you see a 9
			arr[i] = 0; // change the 9 to a 0
		}
		// if all the values in the array are 9
		// create a new array and make the first value a 1
		// each element in a new array are set 0 by default
		int[] newArr = new int[arr.length + 1];
		newArr[0] = 1;
		return newArr;
	}

}
