 // convert int to String --> String.valueOf(insert a int)
// convert String to int --> Integer.parseInt(insert a string)
public class NumberComplement {
	public static void main(String[] args) {
		System.out.println("Solution 1");
		int result = numComplement1(5);
		System.out.println(result);
		
		System.out.println();
		System.out.println("Solution 2");
		System.out.println(numComplement2(5));
		
		System.out.println();
		System.out.println("Solution 3");
		numComplement2(5);

	}

	// Doesn't work for 3 as input
	public static int numComplement1(int num) {
		int n = 0;
		int output = 0;
		while(num > 0) {
			int remainder = num % 2;
			if(remainder == 0) {
				remainder = 1;
			}
			else if(remainder == 1) {
				remainder = 0;				
			}
			output += Math.pow(2, remainder);
			System.out.println(output);
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
        System.out.println(sb);
        return Integer.parseInt(sb.reverse().toString(), 2);  
	}
	
	public static int numComplement3(int num) {
		String s1 = Integer.toBinaryString(num); // Converted the number into a Binary String
	       StringBuilder sb = new StringBuilder(); // String builder because strings are immutable
	       for(int i=0;i<s1.length();i++){ // iterating through the binary string and adding values new String using StringBuilder
	           if(s1.charAt(i)=='0'){
	              sb.append('1');               
	           } else {
	               sb.append('0');
	           }
	       } 
	       return Integer.parseInt(sb.toString(),2); 
        
      
	}
}
