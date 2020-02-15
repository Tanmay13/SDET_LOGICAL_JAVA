package SDET;

public class SDET10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,Sum=0;
		
		System.out.println(n2+" "+n1);
		
		for(int i=2;i<10;i++)
		{
			
		Sum=	n1+n2;
		System.out.println("Sum is :"+Sum);
		n1=n2;
		n2=Sum;
		}

	}

}
