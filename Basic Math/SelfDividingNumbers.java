import java.util.ArrayList;

public class SelfDividingNumbers {

	public static void main(String[] args) {
		int left = 1;
		int right = 22;
		ArrayList<Integer> nums = selfDivide(left,right);
		System.out.println(nums);

	}
	
	public static ArrayList<Integer> selfDivide(int left, int right) {
		// create output array list
        // loop through while left <= right
        // if helper returns true, add left to list
        // increment left
        // return output
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(left <= right) {
            if(helper(left)) { // if it's true
                list.add(left);
            }
            left++;
        }
        return list;
    }
	
	 private static boolean helper(int num) {
	        // create a temporary variable to manipulate
	        // take last digit of num, if it is 0 or is not divisible by num return false
	        // pop off last digit off temp
	        // otherwise if we pass the selfDivide checks, return true
	        
	        int temp = num;
	        System.out.println(temp);
	        while(temp != 0) {
	            int lastDigit = temp % 10; // popping off last value
	            System.out.println(lastDigit);
	            
	            // These are the 2 cases it is not a self dividing number 
	            if(lastDigit == 0 || num % lastDigit != 0) { // example: 128 % 8 = 0
	                return false;
	            }
	            temp = temp / 10;
	            System.out.println(temp);
	        }
	        return true;
	    }
	
	
	

}
