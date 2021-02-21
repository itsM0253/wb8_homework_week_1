
public class PowerOfTwo {

	public static void main(String[] args) {
		int num = 1;
		boolean result = isPowerOf2(num);
		System.out.println(result);

	}
	
	public static boolean isPowerOf2(int n) {
		int result;

			for(int i = 0; i < 31; i++) {
				result = (int) Math.pow(2,i);
				if(result == n) {
					return true;
				}	
			}
			return false;
	  }
	
	

}
