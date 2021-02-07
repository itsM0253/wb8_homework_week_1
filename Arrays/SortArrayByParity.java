import java.util.Arrays;

/* Given an array A of non-negative integers, 
   return an array consisting of all the even elements of A, followed by all the odd elements of A. 
*/
public class SortArrayByParity {
	public static void main(String[] args) {
		System.out.println("Solution 1 ");
		int[] arr = {3,1,2,4};
		System.out.println("Input: " + Arrays.toString(arr));
		int[] arr2 = sortArray1(arr);
		System.out.println("Output: " + Arrays.toString(arr2));
		
		System.out.println();
		System.out.println("Solution 2");
		System.out.println("Input: " + Arrays.toString(arr));
		int[] arr3 = sortArray2(arr);
		System.out.println("Output: " + Arrays.toString(arr3));
		
	}

	
	// Brute force approach 
	public static int[] sortArray1(int[] a) {
		int n = a.length;
		int[] newArr = new int[n]; // declaring a new array 
		int index = 0;
		for(int i = 0; i < n; i++) {
			// add even elements 1st
			if(a[i] % 2 == 0) {
				newArr[index] = a[i];
				index++;
			}
		}
		// time to get the odd elements
		for(int j = 0; j < n; j++) {
			if(a[j] % 2 != 0) {
				newArr[index] = a[j];
				index++;
			}
		}
		return newArr;
	}
	
	public static int[] sortArray2(int[] a) {
		int[] arr = new int[a.length]; // made a new array with same size
		int index = 0; // keeps track of the front for the new array
		int k = a.length - 1; // keeps track of the back of the new array (Last index)
		for(int i = 0; i < a.length; i++) {
			// if even add it to the front of the new array
			if(a[i] % 2 == 0) {
				arr[index] = a[i];
				index++;
			}
			else {
				// if odd add it starting from the back of the array
				arr[k] = a[i];
				k--;
			}
		 }
		return arr;
	 }
}
