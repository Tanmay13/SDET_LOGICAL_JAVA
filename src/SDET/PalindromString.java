package SDET;

public class PalindromString {

	public static void main(String[] args) {

		// String A="Shree Gajana Maharaj Prakat Din 2020";
		String A = "MAADAM";
		String O = A;
		String R = "";
		for (int i = A.length() - 1; i >= 0; i--) {
			R = R + A.charAt(i);

		}
		if (O.equals(R)) {
			System.out.println("Given Strin is Palindrom");

		} else {
			System.out.println("No Palindrom Strings");

		}

	}

}
