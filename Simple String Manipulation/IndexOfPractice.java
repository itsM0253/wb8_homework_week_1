
public class IndexOfPractice {

	public static void main(String[] args) {
		String x = "Karl Hadwen";
		String y = "Karl";
		String z = "Hadwen";
		
		System.out.println("Found Index :" + x.indexOf('a'));
		System.out.println("Found Index :" + x.indexOf('a',4)); // Find letter a starting from index 4
		System.out.println("Found Index :" + x.indexOf(y));
		System.out.println("Found Index :" + x.indexOf(z)); // if two string are equal indexOf will return 0
	}

}
