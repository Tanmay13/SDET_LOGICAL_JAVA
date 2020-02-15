package Array;

import java.util.Scanner;

public class SwapTostring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the two String which want to swap");
		Scanner sc = new Scanner(System.in);
		String A = sc.nextLine();
		String B = sc.nextLine();

		String temp;
		temp = A;
		A = B;
		B = temp;
		System.out.println(A);
		System.out.println(B);

	}

}
