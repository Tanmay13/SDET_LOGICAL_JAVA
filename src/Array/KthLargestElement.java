package Array;

public class KthLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 12, 75, 84, 25, 62, 48, 35, 65 };
		int k = 4;
		for (int i = 0; i < a.length-1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			if (i==k-1) {
				System.out.println("Largest  kth Element is:" + a[i]);
				break;

			}

		}

	}

}
