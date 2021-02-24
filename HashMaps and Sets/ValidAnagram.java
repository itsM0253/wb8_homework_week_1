
public class ValidAnagram {

	public static void main(String[] args) {
		String str1 = "anagram";
		String str2 = "nagaram";
		boolean answer = isAnagram1(str1, str2);
		System.out.println(answer);

	}
	
	public static boolean isAnagram1(String s, String t) {
		int[] letters = new int[26]; // created an array with all the alphabets letters 
		
		if(s.length() == 1 && t.length() == 1) {
			if(s.charAt(0) != t.charAt(0)) {
				return false;
			}
		}
		// iterating through the first word
		for(int i = 0; i < s.length(); i++) {
			letters[s.charAt(i) - 'a']++;  // ZERO based index -> a ASCII value is 97  so, a's = 0 index and store that into the array
		}
		// iterating through the 2nd word
		for(int i = 0; i < t.length(); i++) {
			letters[t.charAt(i) - 'a']--;
		}
		// going through the array to maker sure there is all ZEROS
		for(int i = 0; i < letters.length; i++) {
			if(letters[i] != 0) {
				return false;
			}
		}
		return true;
	}
}
