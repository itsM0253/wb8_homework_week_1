import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		int[] a = {2,11,15,7};
		int[] a2 = {3,2,4};
		int[] a3 = {3,3};
		int target = 6;
		int[] newArr = twoSum2(a3,target);
		System.out.println(Arrays.toString(newArr));
		
		
		

	}
	
	// Brute force solution
	public static int[] twoSum1(int[] a, int target) {
		int[] result =  new int [2];
		for(int i = 0; i < a.length -1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				int answer = a[i] + a[j];
				if(answer == target) {
					 result[0] = i; // the problem asked to return the index NOT value
					 result[1] = j;
				}
			}
		}
		return result;
	}
	
	// HashMap solution 
	public static int[] twoSum2(int[] a, int target) {
		Map<Integer,Integer> map = new HashMap<>(); // stores value & index
		int[] result = new int[2];
		for(int i = 0; i < a.length; i++) {
			int iValue = a[i];
			int jValue = target - iValue; // basically the complement value 
			if(map.containsKey(jValue)) { // if the map already contains this value
				result[0] = map.get(jValue);
				result[1] = i;
			}
			map.put(iValue,i);
		}
		return result;
	}

}
