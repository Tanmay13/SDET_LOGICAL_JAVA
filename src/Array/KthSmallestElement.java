package Array;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={12,52,45,65,85,26,64};
		int k=4;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int t=a[i];
					a[i]=a[j];
					a[j]=t;
					
				}
				
			}
			if(i==k-1)
			{
				System.out.println(a[i]);
				
			}
			
		}

	}

}
