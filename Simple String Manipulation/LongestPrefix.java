
public class LongestPrefix {

	public static void main(String[] args) {
		String[] arr = {"flower", "fl", "flight"};
		String result = longestPrefix(arr);
		System.out.println(result);

	}
	
	public static String longestPrefix(String[] s) {
		if(s.length == 0) {
			return "";
		}
		String prefix = s[0]; // save the first string as the prefix
		for(int i = 1; i < s.length; i++) { // traverse through the other Strings in the array
			while(s[i].indexOf(prefix) != 0) { // cut the prefix down until the two strings are EQUAL they will be ZERO
				prefix = prefix.substring(0, prefix.length() - 1);
			}
		}
		return prefix;
	}
	
	// prefix = "flower"
	// ["flow" , "flight"]

}
