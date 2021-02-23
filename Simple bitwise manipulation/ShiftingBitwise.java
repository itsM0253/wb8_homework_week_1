
public class ShiftingBitwise {

	public static void main(String[] args) {
		// Left shift and Right shift Operator...
			// <<          >>
		int a = 8; // 1 0 0 0 
		
		// left shift -> only add ZEROS not 1's
		int b = a << 2; // 1 0 0 0. so add 2 zeros to left of decimal-> 1 0 0 0 0 0 -> = 32 binary Number
		System.out.println(b);
		
		// right shift, basically removing values
		int c = a >> 2; // 1 0 0 0. so, it send # of bits to the other side -> 1 0 -> = 2 Binary Number
		
		System.out.println(c);
		

	}

}
