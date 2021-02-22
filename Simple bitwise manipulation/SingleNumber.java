import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;
import java.util.*;

public class SingleNumber {

	public static void main(String[] args) {
		int[] numbers = {2,2,1};
		int result = singleNum2(numbers);
		System.out.println(result);

	}

	public static int singleNum1(int[] a) {
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		int num = 0;
		Map<Integer,Integer> map = new TreeMap<>();
	
		for(int i = 0; i < a.length; i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}
			map.put(a[i], map.get(a[i]) + 1);
		}
		System.out.println(map);
		for(Integer numKey : map.keySet()) {
			if(map.get(numKey) == 1) {
				num = numKey;
				System.out.println(num);
			}
		}
		return num;
	}
	
	public static int singleNum2(int[] nums) {
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i: nums) {
			if(set.contains(i)) {
				set.remove(i);
			}
			else {
				set.add(i);
			}
		}
		for(int i: set) {
			return i;
		}
		return -1;
	}
}
