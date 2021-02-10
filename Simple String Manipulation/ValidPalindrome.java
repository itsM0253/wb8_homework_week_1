
public class ValidPalindrome {

	public static void main(String[] args) {
		String s = "race a car";
		boolean answer = validPalindrome1(s); // supposed to be false
		System.out.println(answer);

	}
	
	public static boolean validPalindrome1(String str) {
		str = str.trim(); // removed leading and trailing spaces
		str = str.replaceAll("\\s",""); // strings are immutable so you have to reassign garbage collector
		int i = 0;
		int j = str.length() -1;
		boolean result = true;
		while(i < j) {
			// Taking care of edge cases, I only can compare characters or numbers
			Character c1 = str.charAt(i);
			Character c2 = str.charAt(j);
			while(i < j && !Character.isLetterOrDigit(c1)) {
				i++;
			}
			while(i < j && !Character.isLetterOrDigit(c2)) {
				j--;
			}
			// comparing 2 characters 
			if(i < j && Character.toLowerCase(c1) != Character.toLowerCase(c2)) {
				result = false;
			}
			i++;
			j--;
		}
		return result;
	}
	
	// solution 2
	public boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(); // StringBuilder is mutable 

		for (char c : s.toCharArray()) // traversing through the string by characters
			if (Character.isLetter(c) || Character.isDigit(c))
				sb.append(c);

		String original = sb.toString().toLowerCase(); // Original string
		String reversed = sb.reverse().toString().toLowerCase(); // reversed string

		return original.equals(reversed); // return true or false if it the two strings are equal
	}

}
