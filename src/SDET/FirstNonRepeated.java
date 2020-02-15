package SDET;

public class FirstNonRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="aassdkdf";
		//char[] input=S.toCharArray();
		for(char k:S.toCharArray())
		{
			if(S.indexOf(k)==S.lastIndexOf(k))
			{	System.out.println(k);
			break;
			}
			
		}

	}

}
