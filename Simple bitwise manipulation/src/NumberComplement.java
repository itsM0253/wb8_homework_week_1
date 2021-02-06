
public class NumberComplement {
	public static void main(String[] args) {
		System.out.println("Solution 1");
		int result = numComplement1(3);
		System.out.println(result);
		
		System.out.println();
		System.out.println("Solution 2");
		System.out.println(numComplement2(result));

	}

	// Doesn't work for 3 as input
	public static int numComplement1(int num) {
		int output = 0;
		while(num > 0) {
			int remainder = num % 2;
			if(remainder == 0) {
				remainder = 1;
			}
			if(remainder == 1) {
				remainder = 0;				
			}
			output += Math.pow(2, remainder);
			num = num /2;
		}
		int answer = (int) output -1; // Don't know why I have to do minus 1?
		return answer;
	}
	
	public static int numComplement2(int num) {
		StringBuilder sb = new StringBuilder();
        while (num > 0) {
            int remainder = num % 2; // get the least significant bit (LSB) of the number
            if (remainder == 1) { // reversing the binary
            	sb.append(0); 
            }
            if (remainder == 0) {
            	sb.append(1);
            }
            num /= 2; // update
        }
        return Integer.parseInt(sb.reverse().toString(), 2); 
	}
}
