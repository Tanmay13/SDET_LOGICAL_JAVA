package Example1;

import java.util.ArrayList;
import java.util.Iterator;

public class I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList Al=new ArrayList();
		Al.add("TanmayKhope");
		Al.add("TankSujayqw");
		Al.add("TanmayKhopee");
		Al.add("TankSujayy");
		//Al.add(121);
		System.out.println(Al);
		
		Iterator itr=Al.iterator();
		while(itr.hasNext())
		{
			String s=(String) itr.next();
			System.out.println(s);
			
		}
		
	}
	

}
