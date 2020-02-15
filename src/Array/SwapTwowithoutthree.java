package Array;

import java.util.Scanner;

public class SwapTwowithoutthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number which you want swap");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);

	}

}
