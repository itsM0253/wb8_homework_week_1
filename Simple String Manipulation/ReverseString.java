import java.util.Arrays;

public class ReverseString {
	
	public static void main(String[] args) {
		char[] s = {'h', 'e', 'l', 'l', 'o'};
		reverseString(s);
		
		System.out.println(Arrays.toString(s));
		
		// Another solution using StringBuilder
		StringBuilder sb = new StringBuilder();
		for(char c: s) {
			sb.append(c);
		}
		System.out.println(sb.reverse().toString());
	}
	
	public static void reverseString(char[] s) {
		int j = s.length - 1;
		int i = 0;
		while(i < j) {
			char temp = s[i]; // make sure it's a character not int because of ascii value
			s[i] = s[j];
			s[j] = temp;
			j--;
			i++;
		}
		
	}
}
