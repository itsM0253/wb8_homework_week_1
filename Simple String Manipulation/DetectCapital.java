
public class DetectCapital {

	public static void main(String[] args) {
		String word = "Google";
		boolean answer = detectCapitalUse(word);
		System.out.println(answer);
	}
	
	public static boolean detectCapitalUse(String s) {
		boolean result = false;
		String upperS = s.toUpperCase(); // uppercase version
		String lowerS = s.toLowerCase(); // lowercase version
		
		
		// capitalize only the first letter
		String firstCap = lowerS.substring(0,1).toUpperCase() + lowerS.substring(1); // grabbing the lowercase version and the first character now concaneting the rest
		System.out.println(firstCap);
		
		
		if(s.equals(upperS)) {
			result = true;
		}
		if(s.equals(lowerS)) {
			result = true;
		}
		if(s.equals(firstCap)) {
			result = true;
		}
		return result;
	}

}
