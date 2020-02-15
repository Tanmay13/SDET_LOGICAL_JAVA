package SDET;

public class TwoStringCompaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str1 = "abc";
		         
		String str2 = new String("abc");
		 
		System.out.println(str1 == str2); //false
		 
		System.out.println(str1.equals(str2));//true

	}

}
