package Array;

public class MaxMinArray {

	public static void main(String[] args) {
		
		int a[]={45,85,32,95,45,36,74};
		int Max=a[0];
		for(int i=1;i<a.length;i++)
		{
			
			if(Max<a[i])
			{
				Max=a[i];
				
			}
			
		}
		System.out.println(Max);

	}

}
