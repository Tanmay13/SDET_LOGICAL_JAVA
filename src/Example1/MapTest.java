package Example1;

import java.util.ArrayList;
import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*ArrayList<String>Al=new ArrayList<>();
		Al.add("TanmayKhope");
		Al.add("TankSujay");
		
		HashMap<Integer, String>hm=new HashMap<>();
		hm.put(2, "Tanmay");
		hm.put(1, "Khope");
		System.out.println("hasmap is:"+hm);
		
		
		HashMap mp=new HashMap();
		//mp.put(1,(mp.put(2, "Tanmay")));
		
		mp.put(2, Al);
		System.out.println("value is:"+mp);
		*/
		
		HashMap hm1=new HashMap<>();
		hm1.put(1, "Shivaa");
		hm1.put(2, "Reddy");
		
		HashMap hm2=new HashMap<>();
		hm2.put(1, "Shivaa");
		hm2.put(2, "Reddy");
		
		HashMap hm3=new HashMap<>();
		hm3.put(hm1, hm2);
		//hm3.put(2, "Reddy");
		System.out.println(hm3);
		
		
		
		
	}

}
