package SDET;

public class SDET03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="TanmayKhope";
		int l=s.length();
		String Rev="";
		System.out.println(l);
		for(int i=l-1;i>=0;i--)
		{
			
			Rev=Rev+s.charAt(i);
		}
		
		System.out.println(Rev);

	}

}
