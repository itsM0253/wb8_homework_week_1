import java.util.*;
public class FizzBuzz {
	public static void main(String[] args) {
		int n = 15;
		ArrayList<String> list = fizzBuzz(n);
		System.out.println(list);
		

	}
	
	public static ArrayList<String> fizzBuzz(int n) {
		ArrayList<String> list = new ArrayList<String>();
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0 && i % 5 == 0){
				list.add("FizzBuzz");
			}
			else if(i % 3 != 0 && i % 5 != 0) {
				String str = String.valueOf(i);
				list.add(str);
			}
			else if(i % 3 == 0) {
				list.add("Fizz");
			}
			else if(i % 5 == 0) {
				list.add("Buzz");
			}
		}
		return list;
	}
}
