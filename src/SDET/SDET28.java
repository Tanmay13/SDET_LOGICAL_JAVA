
package SDET;

public class SDET28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="WelCome to Goa Bajirao Singham";
		
		String[]A=S.split(" ");
		String ReverseString="";
		for(String W:A)
		{
			String Reversewords="";
			
			for(int i=W.length()-1;i>=0;i--)
			{
				Reversewords=Reversewords+W.charAt(i);
				
				
			}
			
			ReverseString=ReverseString+Reversewords+" ";
			
			
		}
		
		System.out.println("Reverse string is:"+ReverseString);
	}
}
