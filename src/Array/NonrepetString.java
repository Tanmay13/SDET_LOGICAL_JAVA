package Array;

public class NonrepetString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="teeter";
		for(char ch:s.toCharArray())
		{
			if(s.indexOf(ch)==s.lastIndexOf(ch))
			{
				System.out.println(ch);
				break;
				
			}
			
		}

	}

}
