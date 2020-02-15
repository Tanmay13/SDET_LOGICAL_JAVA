package SDET;

public class ReverseString {

	
		
		 public static void main(String[] args) 
		    { 
		       String A="i like this program very much";
		       String s[] = A.split(" "); 
		        String ans = ""; 
		        for (int i = s.length - 1; i >= 0; i--) { 
		            ans += s[i] + " "; 
		        } 
		        System.out.println("Reversed String:"); 
		      //  System.out.println(ans.substring(0, ans.length() - 1)); 
		    } 

	}


