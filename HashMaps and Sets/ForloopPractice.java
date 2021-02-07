
public class ForloopPractice {

	public static void main(String[] args) {
		int[] a = {2,7,11,15};
		for(int i = 0; i < a.length -1; i++) {
			for(int j = i + 1; j < a.length; j++) {
				System.out.println("i index " + i + " " + "j index " + j);
			}
		}

	}

}
