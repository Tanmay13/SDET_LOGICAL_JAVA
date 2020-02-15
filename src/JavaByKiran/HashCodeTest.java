package JavaByKiran;

import java.util.ArrayList;

public class HashCodeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student S1=new Student(1,"Tanmay");
		Student S2=new Student(1,"Tanmay");
		System.out.println(S1.hashCode());
		System.out.println(S2.hashCode());
		System.out.println("Equality between this two are:"+S1.equals(S2));
		Object o=99;
		ArrayList al=new ArrayList<>();
		//al.

	}

}
