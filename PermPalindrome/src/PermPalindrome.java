
import java.util.Arrays;
import java.util.Scanner;

public class PermPalindrome {
	public static void main(String args[]) {
		String str1, str2 = "", str;
		System.out.println("enter the string you want to check");

		Scanner sc = new Scanner(System.in);
		str1 = sc.nextLine();
		if (str1.length() == 0) {
			System.out.println("enter a valid string");
		}

		// str=sc.nextLine();
		for (int i = str1.length() - 1; i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
		}
		// System.out.println(str2);
		if (str1.equals(str2)) {

			System.out.println("Enter the second string you want to compare");
			str = sc.nextLine();
			if (str1.length() == str.length()) {
				char[] a;
				char[] b;
				a = str1.toCharArray();
				b = str.toCharArray();
				Arrays.sort(a);
				Arrays.sort(b);
				if (Arrays.equals(a, b)) {
					System.out.println("They are equal");
				} else {
					System.out.println("They are different");
				}
			}
		}
		else {
			System.out.println("You have entered a non-palindrome, so program ended here");
		}

		sc.close();


	}
	

}
