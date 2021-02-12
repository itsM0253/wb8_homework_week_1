import java.util.HashSet;
import java.util.Set;

// Write a function that takes a string as input and reverse only the vowels of a string.
public class ReverseVowels {

	public static void main(String[] args) {
		String word = "hello";
		
		String answer = reverseVowels2(word);
		System.out.println(answer);

	}
	
	// Solution 2
	public static String reverseVowels2(String s) {
		Set<Character> vowels = new HashSet<>(); // contains all the vowels
		vowels.add('A');
		vowels.add('a');
		vowels.add('E');
		vowels.add('e');
		vowels.add('I');
		vowels.add('i');
		vowels.add('O');
		vowels.add('o');
		vowels.add('U');
		vowels.add('u');
		
		char[] characters = s.toCharArray(); // created an array of characters since Strings are immutable
		
		int i = 0;
		int j = s.length() -1;
		
		while(i < j) {
			
			while(i < j && !vowels.contains(characters[i])) { // finding a vowel in the front
				i++;
			}
			while(i < j && !vowels.contains(characters[j])) { // finding a vowel from the back
				j--;
			} 
			// Best case, both i and j are vowels
			// swap
			char temp = characters[i]; // grabbing the vowel in the front
			characters[i] = characters[j]; // Changing its value with the one in the back
			characters[j] = temp; // Changing the back value with the value in the front
			i++; // move to the next character
			j--;
		}
		return new String(characters); // created a new string using the String constructor
	}
		
}
