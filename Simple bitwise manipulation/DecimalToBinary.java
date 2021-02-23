// convert int to String --> String.valueOf(insert a int)
// convert String to int --> Integer.parseInt(insert a string)
public class DecimalToBinary {
	
	public static void main(String[] args) {
		int num = 10; 
		String result = "";
		
		// you want it to stop at ZERO
		while(num != 0) {
			result = result + String.valueOf(num % 2); // concacenting the Binary number to string 
			num = num /2; // moving to the next value on the left
		}
		int finalResult = Integer.parseInt(result);
		System.out.println(finalResult);
	}

}
