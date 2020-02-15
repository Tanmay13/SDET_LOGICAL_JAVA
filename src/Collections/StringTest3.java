package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List l=new ArrayList();
l.add("Tanmay");
l.add("Sumit");
l.add("Siimmer");
System.out.println(l);

Iterator itr=l.iterator();
while(itr.hasNext())
{
String y=(String)itr.next();
System.out.println(y);
}
	}

}
