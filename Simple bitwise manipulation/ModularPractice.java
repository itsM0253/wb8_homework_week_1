
public class ModularPractice {

	public static void main(String[] args) {
		int number = 134;
		
		int lastDigit = number % 10;
		System.out.println(lastDigit);
		
		int firstDigit = number;
		while(firstDigit >= 10) {
			firstDigit = firstDigit / 10;
		}
		System.out.println(firstDigit);
		

	}

}
