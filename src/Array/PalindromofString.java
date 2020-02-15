package Array;

public class PalindromofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String K = "Madam";
		String O = K;
		String rev = "";
		for (int i = K.length() - 1; i >= 0; i--) {
			rev = rev + K.charAt(i);

		}
		if (rev.equals(O)) {
			System.out.println("Given String is palindroom String");

		} else {
			System.out.println("Not palindrom");
		}
	}

}
