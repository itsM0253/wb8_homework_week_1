
public class HammingDistance {

	public static void main(String[] args) {
		int x = 1;
		int y = 4;
		int answer = hammingDist(x,y);
		System.out.println(answer);

	}
	
	public static int hammingDist(int x, int y) {
		int result = 0;
		while(x > 0 || y > 0) {
			/* 
			 * So, x % 2 will give us the last bit and we gonna compare them if they are the SAME then return 0
			 * otherwise, return 1
			 */
			result += (x% 2) ^ (y % 2);
			// now we want to deal with new x and y bits to the left so, we gotta shift right
			x >>= 1;
			y >>= 1;
		}
		return result;
	}

}
