package Array;

public class TestSec {
	
	public  static int Getsecond(int a[],int total)
	{
		
	int temp;
	for(int i=0;i<total;i++)
	{
		for(int j=i+1;j<total;j++)
		{
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
			
		}
		
		
	}
		return a[total-2];
		
		
		
	}
	public static void main(String[] args) {
		int a[]={2,3,46,8,5,6,2,9,99};
		
		System.out.println("the seond Lagest Element is:"+TestSec.Getsecond(a,9));
		
	}

}
