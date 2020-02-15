package Collections;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List l=new ArrayList();
		l.add(5);
		l.add(7);
		l.add(98);
		l.add(57);
		l.add("String");
		//Retrival Operations in java by using Get Method in List interface
		System.out.println(l);
		int i=(int)l.get(3);
		System.out.println(i);
		String Name=(String)l.get(4);
		System.out.println(Name);

	}

}
