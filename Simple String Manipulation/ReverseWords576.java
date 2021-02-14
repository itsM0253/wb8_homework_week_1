
public class ReverseWords576 {

	public static void main(String[] args) {
		String word = "Let's take LeetCode contest";
		String answer = reverseWords(word);
		System.out.println(answer);

	}
	
	public static String reverseWords(String str) {
		String[] words = str.split(" "); // created a string array based on spaces
		// grabbing each word and reversing it using a StringBuilder while doing it inPlace
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			words[i] =  new StringBuilder(word).reverse().toString() + " "; // reversing word by word inPlace
		}
		StringBuilder sb = new StringBuilder();
		//traverse through the words array
		for(String s: words) {
			sb.append(s);
		}
		return sb.toString().trim(); // to get rid of the space at the end
	}

}
