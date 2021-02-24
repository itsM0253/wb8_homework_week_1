
public class ForloopPractice {

	public static void main(String[] args) {
		int[] a = {2,7,11,15};
		// every number will get compared all the combinations
		for(int i = 0; i < a.length -1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				System.out.println(i + " " + j);
			}
		}

	}

}
