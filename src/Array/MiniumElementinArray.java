package Array;

public class MiniumElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={7,9,6,62,4,6,22,42};
		int Min=a[0];
		for(int i=0;i<a.length;i++)
		{
			
			if(Min>a[i])
			{
				Min=a[i];
				
			}
		}
		System.out.println(Min);

	}

}
