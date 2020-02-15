package Array;

public class WhiteSpaceRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="im tanmay khope and im indian";
		for(int i=0;i<s.length();i++)
		{
			
			char ch=s.charAt(i);
			if(ch !=' ')
			{
				System.out.print(ch);
				
			}
		}

	}

}
