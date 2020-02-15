package Array;

public class SecondLarge {

	public static int SecondLargst(int a[], int total) {
		int temp;
		for (int i = 0; i < total; i++) {
			for (int j = i + 1; j < total; j++) {
				
				if(a[i]>a[j])
				{
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				}

			}

		}
		return a[total - 1];

	}

	public static void main(String[] args) {
		int a[] = { 12, 24, 65, 32, 56, 89, 75, 64, 32, 95 };
		System.out.println("the second Largest Element:" + SecondLarge.SecondLargst(a, 10));

	}

}
