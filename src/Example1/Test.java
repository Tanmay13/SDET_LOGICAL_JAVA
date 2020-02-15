package Example1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		
		
		/*Creating String ArrayList Object*/

	    ArrayList<String> countrieslist = new ArrayList<String>();
	    countrieslist.add("USA");
	    countrieslist.add("UK");
	    countrieslist.add("India");
	    countrieslist.add("Canada"); 

	    

	    /*Unsorted Countries List*/
	    System.out.println("Countries List Before Sorting:");
	    for(String counter: countrieslist){
	        System.out.println(counter);
	    }

	    
	    
	    
	    System.out.println("=================");
	    /* Sort ArrayList using 
	     * 
	     * 

	       Collections.sort(list) method*/
	   Collections.sort(countrieslist);
	   
	   for(String counter: countrieslist){
	        System.out.println(counter);
	    }

	}

}
