
public class BinaryGap {

	public static void main(String[] args) {
		int n = 6;
		int answer = binaryGap(n);
		System.out.println(answer);

	}
	
	public static int binaryGap(int N) {
		String bN = Integer.toBinaryString(2); // binary string of the integer value
		System.out.println(bN);
		int max = 0;
		for(int i = 0; i < bN.length() -1; i++) {
			for(int j = i + 1; j < bN.length(); j++) {
				if((bN.charAt(i)) == '1' && (bN.charAt(j) == '1')) {
					if(Math.abs(i - j) > max) {
						System.out.println(Math.abs(i - j));
						max = Math.abs(i - j);
						System.out.println(max);
					}
					break;
				}
			}
		}
		return max;
	}

}
