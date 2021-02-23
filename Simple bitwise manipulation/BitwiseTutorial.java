
public class BitwiseTutorial {

	public static void main(String[] args) {
		// ~   Unary bitwise complement
		// <<  Signed left shift
		// >>  Signed right shift
		// >>> Unsigned right shift
		// &   Bitwise AND
		// ^   Bitwise exclusive OR
		// |   Bitwise inclusive OR

		// BitWise Operator -> AND OR
		// AND operator = both are 1, then answer is 1 otherwise answer is 0
		// OR operator = if any of the values are 1, then answer is 1  otherwise answer is 0
		int a = 25; // 1 1 0 0 1
		int b = 15; // 0 1 1 1 1 
		// AND	   // 0 1 0 0 1 --> = 9 binary number
		// OR     // 1 1 1 1 1  -> = 31 binary number
		int c = a & b; 
		int d = a | b;
		System.out.println(c);
		System.out.println(d);
	}

}
