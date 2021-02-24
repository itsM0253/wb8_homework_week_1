import java.util.Arrays;

public class SelectionSort {
	
	public static void main(String[] args) {
	      int[] arr = {4,3 ,1 ,2};
	      System.out.println(Arrays.toString(arr));
	      selectionSort(arr);
	      System.out.println(Arrays.toString(arr));
	   }
	   
	   // Rearranges the elements of a into sorted order using -> MIN to FRONT
	   // the selection sort algorithm.
	   public static void selectionSort(int[] a) {
		   int count = 0;
	       for (int i = 0; i < a.length - 1; i++) { // outer loop is to make sure you you swap at that index
	           // find index of smallest remaining value
	           int min = i; // responsible for keeping track of the index of the minimum number in the array, 
	           for (int j = i + 1; j < a.length; j++) { // I want to compare the new min with the other elements in the array, thats why j = i+1
	               if (a[j] < a[min]) { // if J is LESS than the current min then you need to update the min index
	                   min = j;
	               }
	           }
	   
	           // swap smallest value its proper place, a[i]
	           int temp = a[i];
	           a[i] = a[min];
	           a[min] = temp;
	           count++;
	       }
	       System.out.println(count++);
	   }
	   
}
