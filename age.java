import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		try {
			Scanner sc = new Scanner(System.in);
			int age;
			age = sc.nextInt();

			if (age > 22 && age < 200) {
				System.out.println("abc");
			} else if (age == 22) {
				System.out.println(0);
			} else if (age > 0 && age < 22) {
				System.out.println("def");
			} else {
				throw new IllegalArgumentException();
			}

		} catch (IllegalArgumentException e) {
			System.out.println("Error Occurred");
		}
	}
}
